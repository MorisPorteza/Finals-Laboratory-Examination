package model;

// 𝐓𝐢𝐦𝐞𝐝𝐓𝐚𝐬𝐤 𝐢𝐬 𝐚 𝐬𝐮𝐛𝐜𝐥𝐚𝐬𝐬 𝐨𝐟 𝐓𝐚𝐬𝐤
// It represents a task with an estimated completion time
public class TimedTask extends Task {

    // 𝐒𝐭𝐨𝐫𝐞𝐬 𝐭𝐡𝐞 𝐞𝐬𝐭𝐢𝐦𝐚𝐭𝐞𝐝 𝐭𝐢𝐦𝐞 𝐢𝐧 𝐦𝐢𝐧𝐮𝐭𝐞𝐬 𝐭𝐨 𝐜𝐨𝐦𝐩𝐥𝐞𝐭𝐞 𝐭𝐡𝐞 𝐭𝐚𝐬𝐤
    private int estimatedMinutes;

    // 𝐏𝐚𝐫𝐚𝐦𝐞𝐭𝐞𝐫𝐢𝐳𝐞𝐝 𝐜𝐨𝐧𝐬𝐭𝐫𝐮𝐜𝐭𝐨𝐫
    // Initializes task details, status, and estimated time
    public TimedTask(int taskId, String taskName, String taskDescription,
                     String status, int estimatedMinutes) {

        // 𝐂𝐚𝐥𝐥𝐬 𝐭𝐡𝐞 𝐩𝐚𝐫𝐞𝐧𝐭 𝐓𝐚𝐬𝐤 𝐜𝐨𝐧𝐬𝐭𝐫𝐮𝐜𝐭𝐨𝐫 𝐭𝐨 𝐢𝐧𝐢𝐭𝐢𝐚𝐥𝐢𝐳𝐞 𝐢𝐧𝐡𝐞𝐫𝐢𝐭𝐞𝐝 𝐚𝐭𝐭𝐫𝐢𝐛𝐮𝐭𝐞𝐬
        super(taskId, taskName, taskDescription, status);
        this.estimatedMinutes = estimatedMinutes;
    }

    // 𝐆𝐞𝐭𝐭𝐞𝐫 𝐟𝐨𝐫 𝐞𝐬𝐭𝐢𝐦𝐚𝐭𝐞𝐝𝐌𝐢𝐧𝐮𝐭𝐞𝐬
    // Provides controlled access to the estimated time value
    public int getEstimatedMinutes() {
        return estimatedMinutes;
    }

    // 𝐒𝐞𝐭𝐭𝐞𝐫 𝐟𝐨𝐫 𝐞𝐬𝐭𝐢𝐦𝐚𝐭𝐞𝐝𝐌𝐢𝐧𝐮𝐭𝐞𝐬
    // Allows updating the estimated time while maintaining encapsulation
    public void setEstimatedMinutes(int estimatedMinutes) {
        this.estimatedMinutes = estimatedMinutes;
    }
}
