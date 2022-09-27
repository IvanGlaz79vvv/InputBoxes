package Boxes;

import java.awt. *; // Пакет руководства
import javax.swing.*;

public class Swing_exercise2 extends JFrame {// Наследует фрейм верхнего уровня JFrame

    // Определяем компонент
    // Верхний компонент
    JPanel jp1; // определяем панель
    JSplitPane jsp; // Определяем разделенную панель
    JTextArea jta1; // Определение текстовой области
    JScrollPane jspane1; // Определение панели прокрутки
    JTextArea jta2;
    JScrollPane jspane2;
    // Нижний компонент
    JPanel jp2;
    JButton jb1, jb2; // определяем кнопку
    JComboBox jcb1; // Определяем раскрывающийся список




    public static void main(String[] args)  {
        Swing_exercise2 a = new Swing_exercise2 (); // Отображение интерфейса
    }



    public Swing_exercise2 () // Конструктор
    {
        // Создаем компонент
        // Верхний компонент
        jp1 = new JPanel (); // Создаем панель
        jta1 = new JTextArea (); // Создаем многострочное текстовое поле
        jta1.setLineWrap (true); // Установка автоматического переноса многострочного текстового поля
        jspane1 = new JScrollPane (jta1); // Создаем панель прокрутки
        jta2=new JTextArea();
        jta2.setLineWrap(true);
        jspane2=new JScrollPane(jta2);
        jsp = new JSplitPane (JSplitPane.VERTICAL_SPLIT, jspane1, jspane2); // Создать разделенную панель
        jsp.setDividerLocation (200); // Устанавливаем начальную позицию разделителя разделенной панели
        jsp.setDividerSize (1); // Устанавливаем размер разделителя
        // Нижний компонент
        jp2=new JPanel();
        jb1 = new JButton ("Return"); // Создать кнопку
        jb2 = new JButton ("Отправить");
        String [] name = {"Чжоу Вэйгуо", "Бай Цзыхуа", "Лу Сюэци", "Ким Чен Ын", "Бен Ладен"};
        jcb1 = new JComboBox (name); // Создаем раскрывающийся список

        // Настраиваем управление компоновкой
        jp1.setLayout (new BorderLayout ()); // Устанавливаем макет панели
        jp2.setLayout(new FlowLayout(FlowLayout.RIGHT));

        // Добавляем компонент
        jp1.add(jsp);
        jp2.add(jcb1);
        jp2.add(jb1);
        jp2.add(jb2);

        this.add(jp1,BorderLayout.CENTER);
        this.add(jp2,BorderLayout.SOUTH);

        // Устанавливаем форму для выполнения
        this.setTitle ("chat interface"); // Устанавливаем заголовок интерфейса
        this.setIconImage (new ImageIcon ("image / qq.gif"). getImage ()); // Устанавливаем изображение заголовка, которым является маленький пингвин наверху
        this.setSize (400, 350); // Устанавливаем пиксели интерфейса
        this.setLocation (200, 200); // Устанавливаем начальное расположение интерфейса
        this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); // Устанавливаем виртуальную машину и интерфейс так, чтобы они закрывались вместе
        this.setVisible (true); // Устанавливаем визуализацию интерфейса
    }
}
