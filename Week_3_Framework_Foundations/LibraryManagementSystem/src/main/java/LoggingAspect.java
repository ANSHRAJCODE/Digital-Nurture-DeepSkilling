import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    /**
     * Around Advice to measure performance and log execution entry/exit
     * Intercepts execution of any method inside BookService
     */
    @Around("execution(* BookService.*(..))")
    public Object logExecutionDetails(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        
        System.out.println("\n>>> [AOP BEFORE ADVICE]: Intercepted call to method: " + joinPoint.getSignature().getName());
        
        // Let the actual business method proceed with execution
        Object result = joinPoint.proceed();
        
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        
        System.out.println("<<< [AOP AFTER ADVICE]: Finished method: " + joinPoint.getSignature().getName());
        System.out.println(">>> [AOP METRICS]: Execution complete in " + executionTime + " ms.\n");
        
        return result;
    }
}