package com.eebbk.bfc.sdk.behavior.report.analysis.filter.time;

import com.eebbk.bfc.sdk.behavior.db.entity.Record;
import com.eebbk.bfc.sdk.behavior.report.analysis.conditions.TimeCondition;

import java.text.ParseException;

/**
 * @author hesn
 * @function 获取某个时间之前的所有数据
 * @date 16-9-26
 * @company 步步高教育电子有限公司
 */

public class BeforeTheTimeFilter extends ASortTimeFilter {
    @Override
    public boolean eligible(Record record, TimeCondition condition) throws ParseException {
        long time = getTime(record);
        return time < condition.getToMillis();
    }
}
