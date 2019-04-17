/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.escheduler.dao.model;

import cn.escheduler.common.enums.*;

import java.util.Date;

/**
 * command
 */
public class ErrorCommand {

    /**
     * id
     */
    private int id;

    /**
     * command type
     */
    private CommandType commandType;

    /**
     * process definition id
     */
    private int processDefinitionId;

    /**
     * executor id
     */
    private int executorId;

    /**
     * command parameter, format json
     */
    private String commandParam;

    /**
     * task depend type
     */
    private TaskDependType taskDependType;

    /**
     * failure strategy
     */
    private FailureStrategy failureStrategy;

    /**
     *  warning type
     */
    private WarningType warningType;

    /**
     * warning group id
     */
    private Integer warningGroupId;

    /**
     * schedule time
     */
    private Date scheduleTime;

    /**
     * start time
     */
    private Date startTime;

    /**
     * process instance priority
     */
    private Priority processInstancePriority;

    /**
     * update time
     */
    private Date updateTime;

    /**
     * 执行信息
     */
    private String message;


    public ErrorCommand(Command command, String message){
        this.commandType = command.getCommandType();
        this.executorId = command.getExecutorId();
        this.processDefinitionId = command.getProcessDefinitionId();
        this.commandParam = command.getCommandParam();
        this.warningType = command.getWarningType();
        this.warningGroupId = command.getWarningGroupId();
        this.scheduleTime = command.getScheduleTime();
        this.taskDependType = command.getTaskDependType();
        this.failureStrategy = command.getFailureStrategy();
        this.startTime = command.getStartTime();
        this.updateTime = command.getUpdateTime();
        this.processInstancePriority = command.getProcessInstancePriority();
        this.message = message;
    }

    public ErrorCommand(
            CommandType commandType,
            TaskDependType taskDependType,
            FailureStrategy failureStrategy,
            int executorId,
            int processDefinitionId,
            String commandParam,
            WarningType warningType,
            int warningGroupId,
            Date scheduleTime,
            Priority processInstancePriority,
            String message){
        this.commandType = commandType;
        this.executorId = executorId;
        this.processDefinitionId = processDefinitionId;
        this.commandParam = commandParam;
        this.warningType = warningType;
        this.warningGroupId = warningGroupId;
        this.scheduleTime = scheduleTime;
        this.taskDependType = taskDependType;
        this.failureStrategy = failureStrategy;
        this.startTime = new Date();
        this.updateTime = new Date();
        this.processInstancePriority = processInstancePriority;
        this.message = message;
    }


    public TaskDependType getTaskDependType() {
        return taskDependType;
    }

    public void setTaskDependType(TaskDependType taskDependType) {
        this.taskDependType = taskDependType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CommandType getCommandType() {
        return commandType;
    }

    public void setCommandType(CommandType commandType) {
        this.commandType = commandType;
    }

    public int getProcessDefinitionId() {
        return processDefinitionId;
    }

    public void setProcessDefinitionId(int processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }


    public FailureStrategy getFailureStrategy() {
        return failureStrategy;
    }

    public void setFailureStrategy(FailureStrategy failureStrategy) {
        this.failureStrategy = failureStrategy;
    }

    public void setCommandParam(String commandParam) {
        this.commandParam = commandParam;
    }

    public String getCommandParam() {
        return commandParam;
    }

    public WarningType getWarningType() {
        return warningType;
    }

    public void setWarningType(WarningType warningType) {
        this.warningType = warningType;
    }

    public Integer getWarningGroupId() {
        return warningGroupId;
    }

    public void setWarningGroupId(Integer warningGroupId) {
        this.warningGroupId = warningGroupId;
    }

    public Date getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(Date scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public int getExecutorId() {
        return executorId;
    }

    public void setExecutorId(int executorId) {
        this.executorId = executorId;
    }

    public Priority getProcessInstancePriority() {
        return processInstancePriority;
    }

    public void setProcessInstancePriority(Priority processInstancePriority) {
        this.processInstancePriority = processInstancePriority;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Command{" +
                "id=" + id +
                ", commandType=" + commandType +
                ", processDefinitionId=" + processDefinitionId +
                ", executorId=" + executorId +
                ", commandParam='" + commandParam + '\'' +
                ", taskDependType=" + taskDependType +
                ", failureStrategy=" + failureStrategy +
                ", warningType=" + warningType +
                ", warningGroupId=" + warningGroupId +
                ", scheduleTime=" + scheduleTime +
                ", startTime=" + startTime +
                ", processInstancePriority=" + processInstancePriority +
                ", updateTime=" + updateTime +
                ", message=" + message +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
