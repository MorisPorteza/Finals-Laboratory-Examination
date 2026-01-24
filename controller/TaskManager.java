package controller;

// 𝐈𝐦𝐩𝐨𝐫𝐭𝐬 𝐭𝐡𝐞 𝐓𝐚𝐬𝐤 𝐦𝐨𝐝𝐞𝐥 𝐜𝐥𝐚𝐬𝐬 
import model.Task;

// 𝐈𝐦𝐩𝐨𝐫𝐭𝐬 𝐀𝐫𝐫𝐚𝐲𝐋𝐢𝐬𝐭 𝐭𝐨 𝐬𝐭𝐨𝐫𝐞 𝐦𝐮𝐥𝐭𝐢𝐩𝐥𝐞 𝐓𝐚𝐬𝐤 𝐨𝐛𝐣𝐞𝐜𝐭𝐬 𝐢𝐧 𝐚 𝐝𝐲𝐧𝐚𝐦𝐢𝐜 𝐰𝐚𝐲
import java.util.ArrayList;

// 𝐓𝐚𝐬𝐤𝐌𝐚𝐧𝐚𝐠𝐞𝐫 𝐢𝐬 𝐭𝐡𝐞 𝐨𝐧𝐞 𝐫𝐞𝐬𝐩𝐨𝐧𝐬𝐢𝐛𝐥𝐞 𝐟𝐨𝐫 𝐡𝐚𝐧𝐝𝐥𝐢𝐧𝐠 𝐚𝐥𝐥 𝐭𝐚𝐬𝐤-𝐫𝐞𝐥𝐚𝐭𝐞𝐝 𝐨𝐩𝐞𝐫𝐚𝐭𝐢𝐨𝐧𝐬
// This includes adding tasks, retrieving tasks, and generating task IDs.
public class TaskManager {

    // 𝐒𝐭𝐨𝐫𝐞𝐬 𝐭𝐡𝐞 𝐥𝐢𝐬𝐭 𝐨𝐟 𝐭𝐚𝐬𝐤𝐬 𝐦𝐚𝐧𝐚𝐠𝐞𝐝 𝐛𝐲 𝐭𝐡𝐞 𝐚𝐩𝐩𝐥𝐢𝐜𝐚𝐭𝐢𝐨𝐧
    private ArrayList<Task> taskList;

    // 𝐂𝐨𝐧𝐬𝐭𝐫𝐮𝐜𝐭𝐨𝐫 𝐢𝐧𝐢𝐭𝐢𝐚𝐥𝐢𝐳𝐞𝐬 𝐭𝐡𝐞 𝐭𝐚𝐬𝐤 𝐥𝐢𝐬𝐭
    public TaskManager() {
        taskList = new ArrayList<>();
    }

    // 𝐀𝐝𝐝𝐬 𝐚 𝐓𝐚𝐬𝐤 𝐨𝐛𝐣𝐞𝐜𝐭 𝐭𝐨 𝐭𝐡𝐞 𝐭𝐚𝐬𝐤 𝐥𝐢𝐬𝐭
    // This method is called when a new task is created from the UI.
    public void addTask(Task task) {
        taskList.add(task);
    }

    // 𝐑𝐞𝐭𝐮𝐫𝐧𝐬 𝐭𝐡𝐞 𝐥𝐢𝐬𝐭 𝐨𝐟 𝐚𝐥𝐥 𝐭𝐚𝐬𝐤𝐬
    // Used by the UI to populate the JTable with current task data
    public ArrayList<Task> getTasks() {
        return taskList;
    }

    // 𝐆𝐞𝐧𝐞𝐫𝐚𝐭𝐞𝐬 𝐚 𝐮𝐧𝐢𝐪𝐮𝐞 𝐓𝐚𝐬𝐤 𝐈𝐃 𝐟𝐨𝐫 𝐞𝐚𝐜𝐡 𝐧𝐞𝐰 𝐭𝐚𝐬𝐤
    // Basically, if the list is empty, it starts at 1001. Otherwise, it increments the last task's ID by 1.
    public int generateTaskId() {
        if (taskList.isEmpty()) {
            return 1001;
        }
        return taskList.get(taskList.size() - 1).getTaskId() + 1;
    }
}
