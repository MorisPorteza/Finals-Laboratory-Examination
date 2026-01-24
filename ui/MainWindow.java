package ui;

// 𝐈𝐦𝐩𝐨𝐫𝐭𝐬 𝐭𝐡𝐞 𝐜𝐨𝐧𝐭𝐫𝐨𝐥𝐥𝐞𝐫 𝐫𝐞𝐬𝐩𝐨𝐧𝐬𝐢𝐛𝐥𝐞 𝐟𝐨𝐫 𝐦𝐚𝐧𝐚𝐠𝐢𝐧𝐠 𝐭𝐚𝐬𝐤𝐬
import controller.TaskManager;

// 𝐈𝐦𝐩𝐨𝐫𝐭𝐬 𝐭𝐡𝐞 𝐓𝐚𝐬𝐤 𝐦𝐨𝐝𝐞𝐥 𝐭𝐨 𝐝𝐢𝐬𝐩𝐥𝐚𝐲 𝐭𝐚𝐬𝐤 𝐝𝐚𝐭𝐚
import model.Task;

// 𝐒𝐰𝐢𝐧𝐠 𝐚𝐧𝐝 𝐀𝐖𝐓 𝐢𝐦𝐩𝐨𝐫𝐭𝐬 𝐟𝐨𝐫 𝐆𝐔𝐈 𝐜𝐨𝐦𝐩𝐨𝐧𝐞𝐧𝐭𝐬
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

// 𝐌𝐚𝐢𝐧𝐖𝐢𝐧𝐝𝐨𝐰 𝐬𝐞𝐫𝐯𝐞𝐬 𝐚𝐬 𝐭𝐡𝐞 𝐦𝐚𝐢𝐧 𝐚𝐩𝐩𝐥𝐢𝐜𝐚𝐭𝐢𝐨𝐧 𝐰𝐢𝐧𝐝𝐨𝐰
// It displays the task list and provides access to the task form.
public class MainWindow extends JFrame {

    // 𝐑𝐞𝐟𝐞𝐫𝐞𝐧𝐜𝐞 𝐭𝐨 𝐓𝐚𝐬𝐤𝐌𝐚𝐧𝐚𝐠𝐞𝐫 𝐟𝐨𝐫 𝐫𝐞𝐭𝐫𝐢𝐞𝐯𝐢𝐧𝐠 𝐚𝐧𝐝 𝐦𝐚𝐧𝐚𝐠𝐢𝐧𝐠 𝐭𝐚𝐬𝐤𝐬
    private TaskManager taskManager;

    // 𝐉𝐓𝐚𝐛𝐥𝐞 𝐭𝐨 𝐝𝐢𝐬𝐩𝐥𝐚𝐲 𝐭𝐚𝐬𝐤𝐬
    private JTable table;

    // 𝐓𝐚𝐛𝐥𝐞 𝐦𝐨𝐝𝐞𝐥 𝐭𝐨 𝐦𝐚𝐧𝐚𝐠𝐞 𝐭𝐚𝐛𝐥𝐞 𝐝𝐚𝐭𝐚 𝐝𝐲𝐧𝐚𝐦𝐢𝐜𝐚𝐥𝐥𝐲
    private DefaultTableModel tableModel;

    // 𝐑𝐞𝐟𝐞𝐫𝐞𝐧𝐜𝐞 𝐭𝐨 𝐭𝐡𝐞 𝐭𝐚𝐬𝐤 𝐟𝐨𝐫𝐦 𝐰𝐢𝐧𝐝𝐨𝐰
    // Ensures only one instance of the form can exist at a time
    private TaskForm taskForm; // SINGLE INSTANCE

    // 𝐂𝐨𝐧𝐬𝐭𝐫𝐮𝐜𝐭𝐨𝐫 𝐫𝐞𝐜𝐞𝐢𝐯𝐞𝐬 𝐭𝐡𝐞 𝐓𝐚𝐬𝐤𝐌𝐚𝐧𝐚𝐠𝐞𝐫 𝐢𝐧𝐬𝐭𝐚𝐧𝐜𝐞 𝐟𝐫𝐨𝐦 𝐌𝐚𝐢𝐧
    public MainWindow(TaskManager manager) {

        this.taskManager = manager;

        // 𝐖𝐢𝐧𝐝𝐨𝐰 𝐩𝐫𝐨𝐩𝐞𝐫𝐭𝐢𝐞𝐬
        setTitle("To-Do List Viewer");
        setSize(700, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 𝐁𝐮𝐭𝐭𝐨𝐧 𝐭𝐨 𝐨𝐩𝐞𝐧 𝐭𝐡𝐞 𝐭𝐚𝐬𝐤 𝐢𝐧𝐩𝐮𝐭 𝐟𝐨𝐫𝐦
        JButton addBtn = new JButton("Add Task");

        // 𝐀𝐜𝐭𝐢𝐨𝐧 𝐥𝐢𝐬𝐭𝐞𝐧𝐞𝐫 𝐟𝐨𝐫 𝐭𝐡𝐞 𝐀𝐝𝐝 𝐓𝐚𝐬𝐤 𝐛𝐮𝐭𝐭𝐨𝐧
        addBtn.addActionListener(e -> {

            // 𝐎𝐩𝐞𝐧𝐬 𝐭𝐡𝐞 𝐓𝐚𝐬𝐤𝐅𝐨𝐫𝐦 𝐨𝐧𝐥𝐲 𝐢𝐟 𝐢𝐭 𝐢𝐬 𝐧𝐨𝐭 𝐚𝐥𝐫𝐞𝐚𝐝𝐲 𝐨𝐩𝐞𝐧
            if (taskForm == null || !taskForm.isDisplayable()) {
                taskForm = new TaskForm(taskManager, this);
                taskForm.setVisible(true);
            }
        });

        // 𝐂𝐨𝐥𝐮𝐦𝐧 𝐧𝐚𝐦𝐞𝐬 𝐟𝐨𝐫 𝐭𝐡𝐞 𝐉𝐓𝐚𝐛𝐥𝐞
        String[] columns = {"Task ID", "Task Name", "Task Description", "Status"};

        // 𝐈𝐧𝐢𝐭𝐢𝐚𝐥𝐢𝐳𝐞𝐬 𝐭𝐡𝐞 𝐭𝐚𝐛𝐥𝐞 𝐦𝐨𝐝𝐞𝐥 𝐰𝐢𝐭𝐡 𝐜𝐨𝐥𝐮𝐦𝐧 𝐡𝐞𝐚𝐝𝐞𝐫𝐬
        tableModel = new DefaultTableModel(columns, 0);

        // 𝐂𝐫𝐞𝐚𝐭𝐞𝐬 𝐭𝐡𝐞 𝐉𝐓𝐚𝐛𝐥𝐞 𝐮𝐬𝐢𝐧𝐠 𝐭𝐡𝐞 𝐭𝐚𝐛𝐥𝐞 𝐦𝐨𝐝𝐞𝐥
        table = new JTable(tableModel);

        // 𝐋𝐨𝐚𝐝𝐬 𝐭𝐚𝐬𝐤 𝐝𝐚𝐭𝐚 𝐢𝐧𝐭𝐨 𝐭𝐡𝐞 𝐭𝐚𝐛𝐥𝐞
        refreshTable();

        // 𝐓𝐨𝐩 𝐩𝐚𝐧𝐞𝐥 𝐭𝐨 𝐡𝐨𝐥𝐝 𝐭𝐡𝐞 𝐀𝐝𝐝 𝐓𝐚𝐬𝐤 𝐛𝐮𝐭𝐭𝐨𝐧
        JPanel topPanel = new JPanel();
        topPanel.add(addBtn);

        // 𝐀𝐝𝐝𝐬 𝐜𝐨𝐦𝐩𝐨𝐧𝐞𝐧𝐭𝐬 𝐭𝐨 𝐭𝐡𝐞 𝐟𝐫𝐚𝐦𝐞
        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    // 𝐑𝐞𝐟𝐫𝐞𝐬𝐡𝐞𝐬 𝐭𝐡𝐞 𝐉𝐓𝐚𝐛𝐥𝐞 𝐰𝐢𝐭𝐡 𝐭𝐡𝐞 𝐥𝐚𝐭𝐞𝐬𝐭 𝐭𝐚𝐬𝐤 𝐝𝐚𝐭𝐚
    // Called after adding a new task
    public void refreshTable() {

        // 𝐂𝐥𝐞𝐚𝐫𝐬 𝐞𝐱𝐢𝐬𝐭𝐢𝐧𝐠 𝐫𝐨𝐰𝐬
        tableModel.setRowCount(0);

        // 𝐑𝐞𝐭𝐫𝐢𝐞𝐯𝐞𝐬 𝐭𝐚𝐬𝐤𝐬 𝐟𝐫𝐨𝐦 𝐓𝐚𝐬𝐤𝐌𝐚𝐧𝐚𝐠𝐞𝐫 𝐚𝐧𝐝 𝐚𝐝𝐝𝐬 𝐭𝐡𝐞𝐦 𝐭𝐨 𝐭𝐡𝐞 𝐭𝐚𝐛𝐥𝐞
        for (Task t : taskManager.getTasks()) {

            Object[] row = {
                    t.getTaskId(),
                    t.getTaskName(),
                    t.getTaskDescription(),
                    t.getStatus()
            };

            tableModel.addRow(row);
        }
    }
}
