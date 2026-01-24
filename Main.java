import controller.TaskManager;

import ui.MainWindow;

// 𝐌𝐚𝐢𝐧 𝐜𝐥𝐚𝐬𝐬 
public class Main {

    public static void main(String[] args) {

        // 𝐈𝐧𝐬𝐭𝐚𝐧𝐭𝐢𝐚𝐭𝐞𝐬 𝐭𝐡𝐞 𝐓𝐚𝐬𝐤𝐌𝐚𝐧𝐚𝐠𝐞𝐫
        TaskManager manager = new TaskManager();

        // 𝐂𝐫𝐞𝐚𝐭𝐞𝐬 𝐭𝐡𝐞 𝐦𝐚𝐢𝐧 𝐰𝐢𝐧𝐝𝐨𝐰 𝐚𝐧𝐝 𝐩𝐚𝐬𝐬𝐞𝐬 𝐭𝐡𝐞 𝐓𝐚𝐬𝐤𝐌𝐚𝐧𝐚𝐠𝐞𝐫 𝐢𝐧𝐬𝐭𝐚𝐧𝐜𝐞
        MainWindow window = new MainWindow(manager);

        // 𝐃𝐢𝐬𝐩𝐥𝐚𝐲𝐬 𝐭𝐡𝐞 𝐦𝐚𝐢𝐧 𝐚𝐩𝐩𝐥𝐢𝐜𝐚𝐭𝐢𝐨𝐧 𝐰𝐢𝐧𝐝𝐨𝐰
        window.setVisible(true);
    }
}
