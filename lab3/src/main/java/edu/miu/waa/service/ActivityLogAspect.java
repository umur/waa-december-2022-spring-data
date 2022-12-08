package edu.miu.waa.service;

import edu.miu.waa.model.*;
import edu.miu.waa.repository.ActivityLogRepo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Aspect
@Component
public class ActivityLogAspect {

    private final ActivityLogRepo activityLogRepo;

    public ActivityLogAspect(ActivityLogRepo activityLogRepo) {
        this.activityLogRepo = activityLogRepo;
    }

    @Pointcut("@annotation(edu.miu.waa.annotations.ExecutionTime)")
    public void a() {
    }

    @Around("a()")
    public void logActivity(ProceedingJoinPoint joinPoint) throws Throwable {
        long timeStart = System.nanoTime();
        String operationName = joinPoint.getSignature().getName();
        try {
            joinPoint.proceed();
        } finally {
            long duration = System.nanoTime() - timeStart;
            ActivityLog activityLog = createActivityLog(operationName, duration);
            activityLogRepo.save(activityLog);
        }
    }

    private ActivityLog createActivityLog(String opertion, long duration) {
        ActivityLog activityLog = new ActivityLog();
        activityLog.setDate(LocalDate.now());
        activityLog.setDuration(duration);
        activityLog.setOperation(opertion);
        return activityLog;
    }
}
