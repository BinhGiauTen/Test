package GUI;

import java.awt.EventQueue;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;

import dao.Dao_NhanVien;
import dao.Dao_TaiKhoan;
import entity.NhanVien;
import entity.TaiKhoan;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.awt.event.ActionEvent;

public class FrameLogin extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String SECRET_KEY = "ThisIsASecretKey";
    private Dao_TaiKhoan taiKhoan_dao = new Dao_TaiKhoan();
    private Dao_NhanVien nhanVien_dao = new Dao_NhanVien();
	private JTextField txtTenDangNhap;
	private JPasswordField txtMatKhau;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLogin frame = new FrameLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameLogin() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setBounds(100, 100, 600, 400);
		
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 596, 363);
		getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Thế giới sách");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 35));
		lblNewLabel_1.setBounds(0, -1, 275, 101);
		panel.add(lblNewLabel_1);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setText("Tên đăng nhập:");
		jLabel1.setFont(new Font("Arial", Font.BOLD, 16));
		jLabel1.setBounds(56, 122, 119, 29);
		panel.add(jLabel1);
		
		txtTenDangNhap = new JTextField();
		txtTenDangNhap.setBounds(207, 122, 343, 29);
		panel.add(txtTenDangNhap);
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setText("Mật khẩu:");
		jLabel2.setFont(new Font("Arial", Font.BOLD, 16));
		jLabel2.setBounds(56, 189, 119, 28);
		panel.add(jLabel2);
		
		JButton btnForgotPassword = new JButton();
		btnForgotPassword.setText("Quên mật khẩu?");
		btnForgotPassword.setFont(new Font("Arial", Font.BOLD, 16));
		btnForgotPassword.setBorder(null);
		btnForgotPassword.setBounds(425, 232, 125, 28);
		panel.add(btnForgotPassword);
		
		JButton btnLogin = new JButton();
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					checkLogin();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setText("Đăng nhập");
		btnLogin.setFont(new Font("Arial", Font.BOLD, 16));
		btnLogin.setBackground(new Color(0, 0, 128));
		btnLogin.setBounds(190, 278, 184, 41);
		panel.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 580, 373);
		panel.add(lblNewLabel);
		Image img_bg = new ImageIcon(this.getClass().getResource("/BGLogin2.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img_bg));
		
		txtMatKhau = new JPasswordField();
		txtMatKhau.setBackground(new Color(255, 255, 255));
		txtMatKhau.setBounds(207, 189, 343, 26);
		panel.add(txtMatKhau);
	}
	
	private boolean checkLogin() throws Exception {
		ArrayList<TaiKhoan> dsTK = taiKhoan_dao.getAllTaiKhoan();

		String user = txtTenDangNhap.getText().trim();
		String pass = encrypt(txtMatKhau.getText().trim());
		StringBuilder sb = new StringBuilder();
		if (user.equals("")) {
			sb.append("Vui lòng nhập tên đăng nhập!!!\n");
		}
		if (pass.equals("")) {
			sb.append("Vui lòng nhập mật khẩu!!! \n");
		}
		if (sb.length() > 0) {
			JOptionPane.showMessageDialog(this, sb.toString(), "Cảnh báo", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		for (TaiKhoan tk : dsTK) {
			if (user.equals(tk.getTenTaiKhoan())) {
				if (pass.equals(tk.getMatKhau())) {
					NhanVien nv = tk.getNhanVien();
					NhanVien findNV = nhanVien_dao.getTheoMaNV(nv.getMaNhanVien());
					if(findNV.getTinhTrang().equals("Tạm ngưng")) {
						JOptionPane.showMessageDialog(this, "Bạn đang ở tình trạng tạm ngưng làm việc không có quyền truy cập vào ứng dụng", "Cảnh báo", JOptionPane.ERROR_MESSAGE);
						return false;
					}else {
						if(findNV.getChucVu().equals("Nhân viên quản lý")) {
							setVisible(false);
							FrameDashBoard dashboard = new FrameDashBoard(tk);
					          dashboard.setVisible(true);
					          setVisible(false);
					          return true;
						}else {
							setVisible(false);
							FrameDashBoardNVBH dashboardBH = new FrameDashBoardNVBH(tk);
					          dashboardBH.setVisible(true);
					          setVisible(false);
					          return true;
						}
					}
					
				} else {
					JOptionPane.showMessageDialog(this, "Nhập sai mật khẩu", "Nhập lại", JOptionPane.ERROR_MESSAGE);
					txtMatKhau.requestFocus();
					return false;
				}
			}
		}
		JOptionPane.showMessageDialog(this, "Nhập sai thông tin", "Cảnh báo", JOptionPane.ERROR_MESSAGE);
		txtTenDangNhap.requestFocus();
		return false;
	}
    
    public static String encrypt(String plainText) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(StandardCharsets.UTF_8), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }
    
    public static String decrypt(String encryptedText) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(StandardCharsets.UTF_8), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] encryptedBytes = Base64.getDecoder().decode(encryptedText);
        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
        return new String(decryptedBytes, StandardCharsets.UTF_8);
    }
}
