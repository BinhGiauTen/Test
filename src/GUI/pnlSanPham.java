package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;

public class pnlSanPham extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTable table;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public pnlSanPham() {
		setBackground(Color.CYAN);
		setForeground(Color.YELLOW);
		setBounds(0,0, 1163,763);
		setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1163, 763);
		add(tabbedPane);
		
		JPanel pnlSach = new JPanel();
		tabbedPane.addTab("Sách", null, pnlSach, null);
		pnlSach.setLayout(null);
		
		JPanel pnlThongTin = new JPanel();
		pnlThongTin.setBorder(new TitledBorder(null, "Th\u00F4ng tin:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlThongTin.setBounds(10, 10, 322, 716);
		pnlSach.add(pnlThongTin);
		pnlThongTin.setLayout(null);
		
		JPanel pnlMaSP = new JPanel();
		pnlMaSP.setBounds(10, 22, 302, 65);
		pnlThongTin.add(pnlMaSP);
		pnlMaSP.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã Sản Phẩm: ");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setBounds(90, 5, 128, 22);
		pnlMaSP.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 35, 282, 24);
		pnlMaSP.add(textField);
		textField.setColumns(10);
		
		JPanel pnlTenSP = new JPanel();
		pnlTenSP.setLayout(null);
		pnlTenSP.setBounds(10, 100, 302, 65);
		pnlThongTin.add(pnlTenSP);
		
		JLabel lblNewLabel_1 = new JLabel("Tên Sản Phẩm: ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(88, 5, 139, 22);
		pnlTenSP.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 35, 282, 24);
		pnlTenSP.add(textField_1);
		
		JPanel pnlGiaMua = new JPanel();
		pnlGiaMua.setLayout(null);
		pnlGiaMua.setBounds(10, 178, 302, 65);
		pnlThongTin.add(pnlGiaMua);
		
		JLabel lblNewLabel_1_1 = new JLabel("Giá Mua: ");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(110, 5, 87, 22);
		pnlGiaMua.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 35, 282, 24);
		pnlGiaMua.add(textField_2);
		
		JPanel pnlGiaBan = new JPanel();
		pnlGiaBan.setLayout(null);
		pnlGiaBan.setBounds(10, 256, 302, 65);
		pnlThongTin.add(pnlGiaBan);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Giá Bán: ");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(111, 5, 87, 22);
		pnlGiaBan.add(lblNewLabel_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 35, 282, 24);
		pnlGiaBan.add(textField_3);
		
		JPanel pnlSoLuong = new JPanel();
		pnlSoLuong.setLayout(null);
		pnlSoLuong.setBounds(10, 334, 302, 65);
		pnlThongTin.add(pnlSoLuong);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Số Lượng: ");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(105, 5, 99, 22);
		pnlSoLuong.add(lblNewLabel_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 35, 282, 24);
		pnlSoLuong.add(textField_4);
		
		JPanel pnlTinhTrang = new JPanel();
		pnlTinhTrang.setLayout(null);
		pnlTinhTrang.setBounds(10, 412, 302, 65);
		pnlThongTin.add(pnlTinhTrang);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Tinh Trạng: ");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1.setBounds(103, 5, 99, 22);
		pnlTinhTrang.add(lblNewLabel_1_1_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 35, 282, 24);
		pnlTinhTrang.add(comboBox);
		
		JPanel pnlMaKeHang = new JPanel();
		pnlMaKeHang.setLayout(null);
		pnlMaKeHang.setBounds(10, 490, 302, 65);
		pnlThongTin.add(pnlMaKeHang);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Mã Kệ Hàng: ");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1_1.setBounds(101, 5, 116, 22);
		pnlMaKeHang.add(lblNewLabel_1_1_1_1_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 35, 282, 24);
		pnlMaKeHang.add(comboBox_1);
		
		JPanel pnlMaDanhMuc = new JPanel();
		pnlMaDanhMuc.setLayout(null);
		pnlMaDanhMuc.setBounds(10, 568, 302, 65);
		pnlThongTin.add(pnlMaDanhMuc);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Mã Danh Mục: ");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(97, 5, 136, 22);
		pnlMaDanhMuc.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(10, 35, 282, 24);
		pnlMaDanhMuc.add(comboBox_1_1);
		
		JPanel pnlMaKhuyenMai = new JPanel();
		pnlMaKhuyenMai.setLayout(null);
		pnlMaKhuyenMai.setBounds(10, 646, 302, 65);
		pnlThongTin.add(pnlMaKhuyenMai);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Mã Khuyến Mãi: ");
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(93, 5, 147, 22);
		pnlMaKhuyenMai.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setBounds(10, 35, 282, 24);
		pnlMaKhuyenMai.add(comboBox_1_1_1);
		
		JPanel pnlThongTinSach = new JPanel();
		pnlThongTinSach.setBorder(new TitledBorder(null, "Th\u00F4ng tin S\u00E1ch: ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlThongTinSach.setBounds(335, 10, 813, 147);
		pnlSach.add(pnlThongTinSach);
		pnlThongTinSach.setLayout(null);
		
		JPanel pnlChiTiet = new JPanel();
		pnlChiTiet.setLayout(null);
		pnlChiTiet.setBounds(10, 20, 786, 110);
		pnlThongTinSach.add(pnlChiTiet);
		
		JLabel lblNewLabel_2 = new JLabel("Tác Giả:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(20, 20, 77, 22);
		pnlChiTiet.add(lblNewLabel_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(178, 20, 200, 24);
		pnlChiTiet.add(textField_5);
		
		JLabel lblNewLabel_2_1 = new JLabel("Nhà Xuất Bản:");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(20, 64, 132, 22);
		pnlChiTiet.add(lblNewLabel_2_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(178, 64, 200, 24);
		pnlChiTiet.add(textField_6);
		
		JLabel lblNewLabel_2_2 = new JLabel("Năm Xuất Bản: ");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_2.setBounds(418, 18, 132, 22);
		pnlChiTiet.add(lblNewLabel_2_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(576, 18, 200, 24);
		pnlChiTiet.add(textField_7);
		
		JLabel lblNewLabel_2_3 = new JLabel("Số Trang: ");
		lblNewLabel_2_3.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_3.setBounds(418, 64, 96, 22);
		pnlChiTiet.add(lblNewLabel_2_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(576, 64, 200, 24);
		pnlChiTiet.add(textField_8);
		
		JPanel pnlChucNang = new JPanel();
		pnlChucNang.setBorder(new TitledBorder(null, "Ch\u1EE9c N\u0103ng: ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlChucNang.setBounds(335, 167, 813, 175);
		pnlSach.add(pnlChucNang);
		pnlChucNang.setLayout(null);
		
		JButton btnNewButton = new JButton("Làm mới");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton.setBounds(70, 28, 144, 49);
		pnlChucNang.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Thêm");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1.setBounds(329, 28, 144, 49);
		pnlChucNang.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Cập Nhật");
		btnNewButton_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(602, 28, 144, 49);
		pnlChucNang.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Tìm kiếm sản phẩm:");
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_1.setBounds(70, 114, 177, 22);
		pnlChucNang.add(lblNewLabel_2_1_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(279, 114, 395, 24);
		pnlChucNang.add(textField_9);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(686, 114, 60, 24);
		pnlChucNang.add(btnNewButton_2);
		
		JPanel pnlDsSP = new JPanel();
		pnlDsSP.setBorder(new TitledBorder(null, "Danh s\u00E1ch s\u1EA3n ph\u1EA9m: ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlDsSP.setBounds(335, 352, 813, 374);
		pnlSach.add(pnlDsSP);
		pnlDsSP.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 21, 793, 343);
		pnlDsSP.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 K\u1EC7 H\u00E0ng", "T\u00EAn K\u1EC7 H\u00E0ng", "Gi\u00E1 Mua", "S\u1ED1 L\u01B0\u1EE3ng", "Gi\u00E1 B\u00E1n", "Nh\u00E0 S\u1EA3n Xu\u1EA5t", "T\u00E1c Gi\u1EA3", "N\u0103m Xu\u1EA5t B\u1EA3n", "S\u1ED1 Trang", "M\u00E3 Danh M\u1EE5c", "M\u00E3 K\u1EC7 H\u00E0ng", "M\u00E3 Khuy\u1EBFn M\u00E3i", "T\u00ECnh Tr\u1EA1ng"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Float.class, Integer.class, Float.class, String.class, String.class, Integer.class, Integer.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JPanel pnlVanPhongPham = new JPanel();
		pnlVanPhongPham.setLayout(null);
		tabbedPane.addTab("Văn Phòng Phẩm", null, pnlVanPhongPham, null);
		
		JPanel pnlThongTin_1 = new JPanel();
		pnlThongTin_1.setLayout(null);
		pnlThongTin_1.setBorder(new TitledBorder(null, "Th\u00F4ng tin:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlThongTin_1.setBounds(10, 10, 322, 716);
		pnlVanPhongPham.add(pnlThongTin_1);
		
		JPanel pnlMaSP_1 = new JPanel();
		pnlMaSP_1.setLayout(null);
		pnlMaSP_1.setBounds(10, 22, 302, 65);
		pnlThongTin_1.add(pnlMaSP_1);
		
		JLabel lblNewLabel_3 = new JLabel("Mã Sản Phẩm: ");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(90, 5, 128, 22);
		pnlMaSP_1.add(lblNewLabel_3);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(10, 35, 282, 24);
		pnlMaSP_1.add(textField_10);
		
		JPanel pnlTenSP_1 = new JPanel();
		pnlTenSP_1.setLayout(null);
		pnlTenSP_1.setBounds(10, 100, 302, 65);
		pnlThongTin_1.add(pnlTenSP_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tên Sản Phẩm: ");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(88, 5, 139, 22);
		pnlTenSP_1.add(lblNewLabel_1_2);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(10, 35, 282, 24);
		pnlTenSP_1.add(textField_11);
		
		JPanel pnlGiaMua_1 = new JPanel();
		pnlGiaMua_1.setLayout(null);
		pnlGiaMua_1.setBounds(10, 178, 302, 65);
		pnlThongTin_1.add(pnlGiaMua_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Giá Mua: ");
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_2.setBounds(110, 5, 87, 22);
		pnlGiaMua_1.add(lblNewLabel_1_1_2);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(10, 35, 282, 24);
		pnlGiaMua_1.add(textField_12);
		
		JPanel pnlGiaBan_1 = new JPanel();
		pnlGiaBan_1.setLayout(null);
		pnlGiaBan_1.setBounds(10, 256, 302, 65);
		pnlThongTin_1.add(pnlGiaBan_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Giá Bán: ");
		lblNewLabel_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_1_2.setBounds(111, 5, 87, 22);
		pnlGiaBan_1.add(lblNewLabel_1_1_1_2);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(10, 35, 282, 24);
		pnlGiaBan_1.add(textField_13);
		
		JPanel pnlSoLuong_1 = new JPanel();
		pnlSoLuong_1.setLayout(null);
		pnlSoLuong_1.setBounds(10, 334, 302, 65);
		pnlThongTin_1.add(pnlSoLuong_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Số Lượng: ");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_2.setBounds(105, 5, 99, 22);
		pnlSoLuong_1.add(lblNewLabel_1_1_1_1_2);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(10, 35, 282, 24);
		pnlSoLuong_1.add(textField_14);
		
		JPanel pnlTinhTrang_1 = new JPanel();
		pnlTinhTrang_1.setLayout(null);
		pnlTinhTrang_1.setBounds(10, 412, 302, 65);
		pnlThongTin_1.add(pnlTinhTrang_1);
		
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("Tinh Trạng: ");
		lblNewLabel_1_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1_2.setBounds(103, 5, 99, 22);
		pnlTinhTrang_1.add(lblNewLabel_1_1_1_1_1_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(10, 35, 282, 24);
		pnlTinhTrang_1.add(comboBox_2);
		
		JPanel pnlMaKeHang_1 = new JPanel();
		pnlMaKeHang_1.setLayout(null);
		pnlMaKeHang_1.setBounds(10, 490, 302, 65);
		pnlThongTin_1.add(pnlMaKeHang_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2 = new JLabel("Mã Kệ Hàng: ");
		lblNewLabel_1_1_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1_1_2.setBounds(101, 5, 116, 22);
		pnlMaKeHang_1.add(lblNewLabel_1_1_1_1_1_1_2);
		
		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setBounds(10, 35, 282, 24);
		pnlMaKeHang_1.add(comboBox_1_2);
		
		JPanel pnlMaDanhMuc_1 = new JPanel();
		pnlMaDanhMuc_1.setLayout(null);
		pnlMaDanhMuc_1.setBounds(10, 568, 302, 65);
		pnlThongTin_1.add(pnlMaDanhMuc_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_2 = new JLabel("Mã Danh Mục: ");
		lblNewLabel_1_1_1_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1_1_1_2.setBounds(97, 5, 136, 22);
		pnlMaDanhMuc_1.add(lblNewLabel_1_1_1_1_1_1_1_2);
		
		JComboBox comboBox_1_1_2 = new JComboBox();
		comboBox_1_1_2.setBounds(10, 35, 282, 24);
		pnlMaDanhMuc_1.add(comboBox_1_1_2);
		
		JPanel pnlMaKhuyenMai_1 = new JPanel();
		pnlMaKhuyenMai_1.setLayout(null);
		pnlMaKhuyenMai_1.setBounds(10, 646, 302, 65);
		pnlThongTin_1.add(pnlMaKhuyenMai_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("Mã Khuyến Mãi: ");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1_1_1_1_1.setBounds(93, 5, 147, 22);
		pnlMaKhuyenMai_1.add(lblNewLabel_1_1_1_1_1_1_1_1_1);
		
		JComboBox comboBox_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1.setBounds(10, 35, 282, 24);
		pnlMaKhuyenMai_1.add(comboBox_1_1_1_1);
		
		JPanel pnlThongTinVanPhongPham = new JPanel();
		pnlThongTinVanPhongPham.setLayout(null);
		pnlThongTinVanPhongPham.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Th\u00F4ng tin V\u0103n Ph\u00F2ng Ph\u1EA9m: ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlThongTinVanPhongPham.setBounds(335, 10, 813, 147);
		pnlVanPhongPham.add(pnlThongTinVanPhongPham);
		
		JPanel pnlChiTiet_1 = new JPanel();
		pnlChiTiet_1.setLayout(null);
		pnlChiTiet_1.setBounds(10, 20, 786, 110);
		pnlThongTinVanPhongPham.add(pnlChiTiet_1);
		
		JLabel lblNewLabel_2_4 = new JLabel("Thương Hiệu:");
		lblNewLabel_2_4.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_4.setBounds(20, 20, 111, 22);
		pnlChiTiet_1.add(lblNewLabel_2_4);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(178, 20, 200, 24);
		pnlChiTiet_1.add(textField_15);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Xuất xứ:");
		lblNewLabel_2_1_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_2.setBounds(20, 64, 132, 22);
		pnlChiTiet_1.add(lblNewLabel_2_1_2);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(178, 64, 200, 24);
		pnlChiTiet_1.add(textField_16);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Màu Sắc: ");
		lblNewLabel_2_2_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_2_1.setBounds(418, 18, 132, 22);
		pnlChiTiet_1.add(lblNewLabel_2_2_1);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(576, 18, 200, 24);
		pnlChiTiet_1.add(textField_17);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Chất liệu: ");
		lblNewLabel_2_3_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_3_1.setBounds(418, 64, 96, 22);
		pnlChiTiet_1.add(lblNewLabel_2_3_1);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(576, 64, 200, 24);
		pnlChiTiet_1.add(textField_18);
		
		JPanel pnlChucNang_1 = new JPanel();
		pnlChucNang_1.setLayout(null);
		pnlChucNang_1.setBorder(new TitledBorder(null, "Ch\u1EE9c N\u0103ng: ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlChucNang_1.setBounds(335, 167, 813, 175);
		pnlVanPhongPham.add(pnlChucNang_1);
		
		JButton btnNewButton_3 = new JButton("Làm mới");
		btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_3.setBounds(70, 28, 144, 49);
		pnlChucNang_1.add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("Thêm");
		btnNewButton_1_2.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1_2.setBounds(329, 28, 144, 49);
		pnlChucNang_1.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_1 = new JButton("Cập Nhật");
		btnNewButton_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1_1_1.setBounds(602, 28, 144, 49);
		pnlChucNang_1.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Tìm kiếm sản phẩm:");
		lblNewLabel_2_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_1_1.setBounds(70, 114, 177, 22);
		pnlChucNang_1.add(lblNewLabel_2_1_1_1);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(279, 114, 395, 24);
		pnlChucNang_1.add(textField_19);
		
		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.setBounds(686, 114, 60, 24);
		pnlChucNang_1.add(btnNewButton_2_1);
		
		JPanel pnlDsSP_1 = new JPanel();
		pnlDsSP_1.setLayout(null);
		pnlDsSP_1.setBorder(new TitledBorder(null, "Danh s\u00E1ch s\u1EA3n ph\u1EA9m: ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlDsSP_1.setBounds(335, 352, 813, 374);
		pnlVanPhongPham.add(pnlDsSP_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(10, 21, 793, 343);
		pnlDsSP_1.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 S\u1EA3n Ph\u1EA9m", "T\u00EAn S\u1EA3n Ph\u1EA9m", "Gi\u00E1 Mua", "S\u1ED1 L\u01B0\u1EE3ng", "Gi\u00E1 B\u00E1n", "Th\u01B0\u01A1ng Hi\u1EC7u", "Xu\u1EA5t X\u1EE9", "M\u00E0u S\u1EAFc", "Ch\u1EA5t Li\u1EC7u", "M\u00E3 Danh M\u1EE5c", "T\u00ECnh Tr\u1EA1ng", "M\u00E3 Khuy\u1EBFn M\u00E3i", "M\u00E3 K\u1EC7 H\u00E0ng"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Float.class, Integer.class, Float.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_1.setViewportView(table_1);
	}
}
