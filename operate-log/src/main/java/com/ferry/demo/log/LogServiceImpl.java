package com.ferry.demo.log;

import com.mzt.logapi.beans.LogRecord;
import com.mzt.logapi.service.ILogRecordService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LogServiceImpl implements ILogRecordService {
    private final LogMapper logMapper;

    //    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    @Override
    public void record(LogRecord logRecord) {
        Log log = new Log();
        BeanUtils.copyProperties(logRecord, log);
        logMapper.insert(log);
    }

    @Override
    public List<LogRecord> queryLog(String bizKey) {
        return null;
    }

    @Override
    public List<LogRecord> queryLogByBizNo(String bizNo) {
        return null;
    }
}
