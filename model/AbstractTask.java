package model;

// 𝐀𝐛𝐬𝐭𝐫𝐚𝐜𝐭𝐓𝐚𝐬𝐤 𝐬𝐞𝐫𝐯𝐞𝐬 𝐚𝐬 𝐭𝐡𝐞 𝐩𝐚𝐫𝐞𝐧𝐭 𝐜𝐥𝐚𝐬𝐬 𝐟𝐨𝐫 𝐚𝐥𝐥 𝐭𝐚𝐬𝐤 𝐭𝐲𝐩𝐞𝐬.
// It defines common attributes and enforces status handling through abstraction.
public abstract class AbstractTask {

    // 𝐔𝐧𝐢𝐪𝐮𝐞 𝐢𝐝𝐞𝐧𝐭𝐢𝐟𝐢𝐞𝐫 𝐟𝐨𝐫 𝐭𝐡𝐞 𝐭𝐚𝐬𝐤
    protected int taskId;

    // 𝐍𝐚𝐦𝐞/𝐭𝐢𝐭𝐥𝐞 𝐨𝐟 𝐭𝐡𝐞 𝐭𝐚𝐬𝐤
    protected String taskName;

    // 𝐃𝐞𝐭𝐚𝐢𝐥𝐞𝐝 𝐝𝐞𝐬𝐜𝐫𝐢𝐩𝐭𝐢𝐨𝐧 𝐨𝐟 𝐭𝐡𝐞 𝐭𝐚𝐬𝐤
    protected String taskDescription;

    // 𝐃𝐞𝐟𝐚𝐮𝐥𝐭 𝐜𝐨𝐧𝐬𝐭𝐫𝐮𝐜𝐭𝐨𝐫
    // Allows subclasses to create objects without immediately setting values
    public AbstractTask() {
    }

    // 𝐏𝐚𝐫𝐚𝐦𝐞𝐭𝐞𝐫𝐢𝐳𝐞𝐝 𝐜𝐨𝐧𝐬𝐭𝐫𝐮𝐜𝐭𝐨𝐫
    // Initializes all common task attributes
    public AbstractTask(int taskId, String taskName, String taskDescription) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    // 𝐀𝐛𝐬𝐭𝐫𝐚𝐜𝐭 𝐠𝐞𝐭𝐭𝐞𝐫 𝐟𝐨𝐫 𝐭𝐚𝐬𝐤 𝐬𝐭𝐚𝐭𝐮𝐬
    // Forces subclasses to provide their own implementation
    public abstract String getStatus();

    // 𝐀𝐛𝐬𝐭𝐫𝐚𝐜𝐭 𝐬𝐞𝐭𝐭𝐞𝐫 𝐟𝐨𝐫 𝐭𝐚𝐬𝐤 𝐬𝐭𝐚𝐭𝐮𝐬
    // Ensures status handling is defined in child classes
    public abstract void setStatus(String status);

    // 𝐆𝐞𝐭𝐭𝐞𝐫 𝐟𝐨𝐫 𝐭𝐚𝐬𝐤 𝐈𝐃
    public int getTaskId() {
        return taskId;
    }

    // 𝐒𝐞𝐭𝐭𝐞𝐫 𝐟𝐨𝐫 𝐭𝐚𝐬𝐤 𝐈𝐃
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    // 𝐆𝐞𝐭𝐭𝐞𝐫 𝐟𝐨𝐫 𝐭𝐚𝐬𝐤 𝐧𝐚𝐦𝐞
    public String getTaskName() {
        return taskName;
    }

    // 𝐒𝐞𝐭𝐭𝐞𝐫 𝐟𝐨𝐫 𝐭𝐚𝐬𝐤 𝐧𝐚𝐦𝐞
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    // 𝐆𝐞𝐭𝐭𝐞𝐫 𝐟𝐨𝐫 𝐭𝐚𝐬𝐤 𝐝𝐞𝐬𝐜𝐫𝐢𝐩𝐭𝐢𝐨𝐧
    public String getTaskDescription() {
        return taskDescription;
    }

    // 𝐒𝐞𝐭𝐭𝐞𝐫 𝐟𝐨𝐫 𝐭𝐚𝐬𝐤 𝐝𝐞𝐬𝐜𝐫𝐢𝐩𝐭𝐢𝐨𝐧
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
}
