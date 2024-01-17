# Buổi 12: Java swing cơ bản

- Java Swing là một bộ công cụ GUI (Graphical User Interface) được cung cấp bởi Java để phát triển giao diện người dùng đồ họa cho ứng dụng Java

- Swing hỗ trợ nhiều thành phần giao diện người dùng như các nút, ô văn bản, bảng, cửa sổ, và các thành phần khác để xây dựng các ứng dụng GUI đa dạng

- Swing được thiết kế để thay thế Abstract Window Toolkit (AWT) cũ và cung cấp các thành phần giao diện người dùng (UI) mạnh mẽ và linh hoạt hơn.

![](https://viettuts.vn/images/java-swing/phan-cap-cac-lop-java-swing.jpg)

## Các thành phần giao diện cơ bản
- JFrame: Là cửa sổ chính của ứng dụng, nơi bạn đặt các thành phần khác như nút, ô văn bản, v.v.
- JPanel: Là một vùng chứa để nhóm các thành phần khác lại với nhau.
- JButton: Được sử dụng để tạo nút, khi người dùng nhấn vào nút, sự kiện có thể được kích hoạt.
- JLabel: Hiển thị một dòng văn bản hoặc hình ảnh.
- JTextField: Cho phép người dùng nhập văn bản.
- JTextArea: Tương tự như JTextField, nhưng dành cho văn bản đa dòng.
- JCheckBox và JRadioButton: Được sử dụng để tạo các ô kiểm (checkbox) và nút radio.
- JComboBox: Là một hộp thoại thả xuống cho phép người dùng chọn từ một danh sách các mục.
- JList: Hiển thị một danh sách các mục có thể chọn.
- JScrollPane: Dùng để thêm thanh cuộn vào các thành phần không thể hiển thị toàn bộ nội dung trên một màn hình.
- JSeparator: Tạo đường phân cách giữa các thành phần.
- JProgressBar: Hiển thị tiến trình hoàn thành của một công việc.
- JSlider: Cho phép người dùng chọn một giá trị trong một dải giá trị.
- JMenuBar, JMenu và JMenuItem: Được sử dụng để tạo menu cho ứng dụng.
- JFileChooser: Cho phép người dùng chọn một tệp tin hoặc thư mục.
- JTabbedPane: Hiển thị nhiều tab, mỗi tab có thể chứa một thành phần GUI độc lập.
- JTable: hiển thị dữ liệu dưới dạng bảng có thể được tùy chỉnh

## Xử lý sự kiện trên giao diện
- Các sự kiện được tạo ra là do tương tác của người dùng với các thành phần UI. Ví dụ như việc nhấn vào một nút button, di chuyển chuột, nhập ký tự thông qua bàn phím, …
- Xử lý sự kiện (Event Handling) là một kỹ thuật kiểm soát sự kiện và quyết định những gì cần thực hiện nếu một sự kiện xảy ra.