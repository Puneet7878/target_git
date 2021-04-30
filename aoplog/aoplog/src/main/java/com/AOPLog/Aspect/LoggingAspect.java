package com.AOPLog.Aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;



import javassist.bytecode.SignatureAttribute.MethodSignature;

@Aspect
@Component
public class LoggingAspect {
	
	private static final Logger LOGGER = LogManager.getLogger(LoggingAspect.class);


	/**
	 * This method uses Around advice which ensures that an advice can run before
	 * and after the method execution, to and log the execution time of the method
	 * This advice will be be applied to all the method which are annotate with the
	 * annotation @LogExecutionTime @see com.example.springaop.logging.LogExecutionTime
	 * 
	 * Any mehtod where execution times need to be measue and log, anotate the method with @LogExecutionTime
	 * example 
	 * @LogExecutionTime
	 * public void m1();
	 * 
	 * @param proceedingJoinPoint
	 * @return
	 * @throws Throwable
	 */
	@Around("@annotation(com.example.springaop.logging.LogExecutionTime)")
	public Object methodTimeLogger(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

		// Get intercepted method details
		String className = ((Signature) methodSignature).getDeclaringType().getSimpleName();
		String methodName = ((Logger) methodSignature).getName();

		// Measure method execution time
		StopWatch stopWatch = new StopWatch(className + "->" + methodName);
		stopWatch.start(methodName);
		Object result = proceedingJoinPoint.proceed();
		stopWatch.stop();
		// Log method execution time
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info(stopWatch.prettyPrint());
		}
		return result;
	}

}
