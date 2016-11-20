package com.ztesoft.dispatcher.modules.act.service.creator;

import java.util.List;

/**
 * RuntimeActivityDefinitionEntity的解释类（代理类）
 * 主要用以解释properties字段的值，如为get("name")提供getName()方法
 *
 * @author bluejoe2008@gmail.com
 */
public class RuntimeActivityDefinitionEntityIntepreter {
    RuntimeActivityDefinitionEntity _entity;

    public RuntimeActivityDefinitionEntityIntepreter(RuntimeActivityDefinitionEntity entity) {
        super();
        _entity = entity;
    }

    public List<String> getAssignees() {
        return _entity.getProperty("assignees");
    }

    public void setAssignees(List<String> assignees) {
        _entity.setProperty("assignees", assignees);
    }

    public String getCloneActivityId() {
        return _entity.getProperty("cloneActivityId");
    }

    public void setCloneActivityId(String cloneActivityId) {
        _entity.setProperty("cloneActivityId", cloneActivityId);
    }

    public List<String> getCloneActivityIds() {
        return _entity.getProperty("cloneActivityIds");
    }

    public void setCloneActivityIds(List<String> cloneActivityIds) {
        _entity.setProperty("cloneActivityIds", cloneActivityIds);
    }

    public String getNextActivityId() {
        return _entity.getProperty("nextActivityId");
    }

    public void setNextActivityId(String nextActivityId) {
        _entity.setProperty("nextActivityId", nextActivityId);
    }

    public String getPrototypeActivityId() {
        return _entity.getProperty("prototypeActivityId");
    }

    public void setPrototypeActivityId(String prototypeActivityId) {
        _entity.setProperty("prototypeActivityId", prototypeActivityId);
    }

    public boolean getSequential() {
        return (Boolean) _entity.getProperty("sequential");
    }

    public void setSequential(boolean sequential) {
        _entity.setProperty("sequential", sequential);
    }
}
