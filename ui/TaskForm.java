package ui;

// 𝐈𝐦𝐩𝐨𝐫𝐭𝐬 𝐭𝐡𝐞 𝐜𝐨𝐧𝐭𝐫𝐨𝐥𝐥𝐞𝐫 𝐮𝐬𝐞𝐝 𝐭𝐨 𝐦𝐚𝐧𝐚𝐠𝐞 𝐭𝐚𝐬𝐤𝐬
import controller.TaskManager;

// 𝐈𝐦𝐩𝐨𝐫𝐭𝐬 𝐭𝐡𝐞 𝐓𝐚𝐬𝐤 𝐦𝐨𝐝𝐞𝐥
import model.Task;

// 𝐒𝐰𝐢𝐧𝐠 𝐚𝐧𝐝 𝐀𝐖𝐓 𝐢𝐦𝐩𝐨𝐫𝐭𝐬 𝐟𝐨𝐫 𝐆𝐔𝐈 𝐜𝐨𝐦𝐩𝐨𝐧𝐞𝐧𝐭𝐬
import javax.swing.*;
import java.awt.*;

// 𝐓𝐚𝐬𝐤𝐅𝐨𝐫𝐦 𝐫𝐞𝐩𝐫𝐞𝐬𝐞𝐧𝐭𝐬 𝐭𝐡𝐞 𝐬𝐞𝐩𝐚𝐫𝐚𝐭𝐞 𝐰𝐢𝐧𝐝𝐨𝐰 𝐮𝐬𝐞𝐝 𝐭𝐨 𝐢𝐧𝐩𝐮𝐭 𝐧𝐞𝐰 𝐭𝐚𝐬𝐤 𝐝𝐞𝐭𝐚𝐢𝐥𝐬
public class TaskForm extends JFrame {

    // 𝐑𝐞𝐟𝐞𝐫𝐞𝐧𝐜𝐞 𝐭𝐨 𝐓𝐚𝐬𝐤𝐌𝐚𝐧𝐚𝐠𝐞𝐫 𝐭𝐨 𝐬𝐭𝐨𝐫𝐞 𝐭𝐡𝐞 𝐜𝐫𝐞𝐚𝐭𝐞𝐝 𝐭𝐚𝐬𝐤
    private TaskManager taskManager;

    // 𝐑𝐞𝐟𝐞𝐫𝐞𝐧𝐜𝐞 𝐭𝐨 𝐌𝐚𝐢𝐧𝐖𝐢𝐧𝐝𝐨𝐰 𝐭𝐨 𝐫𝐞𝐟𝐫𝐞𝐬𝐡 𝐭𝐡𝐞 𝐉𝐓𝐚𝐛𝐥𝐞 𝐚𝐟𝐭𝐞𝐫 𝐬𝐚𝐯𝐢𝐧𝐠
    private MainWindow mainWindow;

    // 𝐅𝐨𝐫𝐦 𝐢𝐧𝐩𝐮𝐭 𝐜𝐨𝐦𝐩𝐨𝐧𝐞𝐧𝐭𝐬
    private JTextField txtId, txtName;
    private JTextArea txtDesc;
    private JComboBox<String> cmbStatus;

    // 𝐂𝐨𝐧𝐬𝐭𝐫𝐮𝐜𝐭𝐨𝐫 𝐫𝐞𝐜𝐞𝐢𝐯𝐞𝐬 𝐓𝐚𝐬𝐤𝐌𝐚𝐧𝐚𝐠𝐞𝐫 𝐚𝐧𝐝 𝐌𝐚𝐢𝐧𝐖𝐢𝐧𝐝𝐨𝐰 𝐢𝐧𝐬𝐭𝐚𝐧𝐜𝐞𝐬
    public TaskForm(TaskManager manager, MainWindow window) {

        this.taskManager = manager;
        this.mainWindow = window;

        // 𝐖𝐢𝐧𝐝𝐨𝐰 𝐩𝐫𝐨𝐩𝐞𝐫𝐭𝐢𝐞𝐬
        setTitle("Add Task Form");
        setSize(350, 350);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 1));

        // 𝐓𝐚𝐬𝐤 𝐈𝐃 𝐟𝐢𝐞𝐥𝐝 
        txtId = new JTextField();
        txtId.setEditable(false);
        txtId.setText(String.valueOf(taskManager.generateTaskId()));

        // 𝐈𝐧𝐩𝐮𝐭 𝐟𝐢𝐞𝐥𝐝𝐬 𝐟𝐨𝐫 𝐭𝐚𝐬𝐤 𝐧𝐚𝐦𝐞 𝐚𝐧𝐝 𝐝𝐞𝐬𝐜𝐫𝐢𝐩𝐭𝐢𝐨𝐧
        txtName = new JTextField();
        txtDesc = new JTextArea();

        // 𝐂𝐨𝐦𝐛𝐨 𝐛𝐨𝐱 𝐟𝐨𝐫 𝐭𝐚𝐬𝐤 𝐬𝐭𝐚𝐭𝐮𝐬 𝐬𝐞𝐥𝐞𝐜𝐭𝐢𝐨𝐧
        cmbStatus = new JComboBox<>();
        cmbStatus.addItem("Not Started");
        cmbStatus.addItem("Ongoing");
        cmbStatus.addItem("Completed");

        // 𝐒𝐚𝐯𝐞 𝐛𝐮𝐭𝐭𝐨𝐧
        JButton saveBtn = new JButton("Save Task");

        // 𝐀𝐜𝐭𝐢𝐨𝐧 𝐥𝐢𝐬𝐭𝐞𝐧𝐞𝐫 𝐭𝐨 𝐭𝐫𝐢𝐠𝐠𝐞𝐫 𝐭𝐚𝐬𝐤 𝐬𝐚𝐯𝐢𝐧𝐠
        saveBtn.addActionListener(e -> saveTask());

        // 𝐀𝐝𝐝𝐢𝐧𝐠 𝐜𝐨𝐦𝐩𝐨𝐧𝐞𝐧𝐭𝐬 𝐭𝐨 𝐭𝐡𝐞 𝐟𝐨𝐫𝐦
        add(new JLabel("Task ID"));
        add(txtId);

        add(new JLabel("Task Name"));
        add(txtName);

        add(new JLabel("Task Description"));
        add(new JScrollPane(txtDesc));

        add(new JLabel("Status"));
        add(cmbStatus);

        add(saveBtn);
    }

    // 𝐇𝐚𝐧𝐝𝐥𝐞𝐬 𝐭𝐚𝐬𝐤 𝐜𝐫𝐞𝐚𝐭𝐢𝐨𝐧, 𝐯𝐚𝐥𝐢𝐝𝐚𝐭𝐢𝐨𝐧, 𝐚𝐧𝐝 𝐬𝐚𝐯𝐢𝐧𝐠
    private void saveTask() {

        if (txtName.getText().trim().isEmpty() ||
            txtDesc.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "All fields are required!");
            return;
        }

        int id = Integer.parseInt(txtId.getText());
        String name = txtName.getText();
        String desc = txtDesc.getText();

        String status;

        // 𝐌𝐚𝐩𝐬 𝐜𝐨𝐦𝐛𝐨 𝐛𝐨𝐱 𝐯𝐚𝐥𝐮𝐞𝐬 𝐭𝐨 𝐓𝐚𝐬𝐤 𝐬𝐭𝐚𝐭𝐮𝐬 𝐜𝐨𝐧𝐬𝐭𝐚𝐧𝐭𝐬
        if (cmbStatus.getSelectedItem().equals("Completed")) {
            status = Task.DONE;
        } else if (cmbStatus.getSelectedItem().equals("Ongoing")) {
            status = Task.ONGOING;
        } else {
            status = Task.NOT_STARTED;
        }

        // 𝐂𝐫𝐞𝐚𝐭𝐞𝐬 𝐚 𝐓𝐚𝐬𝐤 𝐨𝐛𝐣𝐞𝐜𝐭 𝐮𝐬𝐢𝐧𝐠 𝐭𝐡𝐞 𝐢𝐧𝐩𝐮𝐭 𝐝𝐚𝐭𝐚
        Task task = new Task(id, name, desc, status);

        // 𝐏𝐚𝐬𝐬𝐞𝐬 𝐭𝐡𝐞 𝐭𝐚𝐬𝐤 𝐭𝐨 𝐓𝐚𝐬𝐤𝐌𝐚𝐧𝐚𝐠𝐞𝐫 𝐟𝐨𝐫 𝐬𝐭𝐨𝐫𝐚𝐠𝐞
        taskManager.addTask(task);

        // 𝐑𝐞𝐟𝐫𝐞𝐬𝐡𝐞𝐬 𝐭𝐡𝐞 𝐉𝐓𝐚𝐛𝐥𝐞 𝐢𝐧 𝐭𝐡𝐞 𝐦𝐚𝐢𝐧 𝐰𝐢𝐧𝐝𝐨𝐰
        mainWindow.refreshTable();

        // 𝐂𝐥𝐨𝐬𝐞𝐬 𝐭𝐡𝐞 𝐟𝐨𝐫𝐦 𝐰𝐢𝐧𝐝𝐨𝐰
        dispose();
    }
}
