package com.lumindevs;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import static com.lumindevs.util.Utils.log;

public class App {

	private JFrame frame;
	private JMenuBar menuBar;
	
	private JFrame frameAddCeramica;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		

		menuBar = new JMenuBar();
		// Add main menu bar
		frame.setJMenuBar(menuBar);
		
		addMenus();

		
	}
	
	private void addMenus() {
		addMenuArchivo();
		addMenuMante();
		addMenuVentas();
		addMenuConfig();
		addMenuAyuda();
	}
	
	private void addMenuArchivo() {
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem.addActionListener( e -> {
			log("closing");
			System.exit(0);
		});
	}
	
	private void addMenuMante() {
		JMenu mnNewMenu = new JMenu("Mantenimiento");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem2 = new JMenuItem("Consultar ceramica");
		JMenuItem mntmNewMenuItem3 = new JMenuItem("Modificar ceramica");
		JMenuItem mntmNewMenuItem4 = new JMenuItem("Listar ceramicos");
		mnNewMenu.add(mntmNewMenuItem2);
		mnNewMenu.add(mntmNewMenuItem3);
		mnNewMenu.add(mntmNewMenuItem4);
		
		mntmNewMenuItem2.addActionListener( e -> {
			log("opening consultar ceramica");
			frameAddCeramica = new JFrame();
			frameAddCeramica.setBounds(100, 100, 450, 300);
			frameAddCeramica.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			frameAddCeramica.setVisible(true);
		});
	}
	
	private void addMenuVentas() {
		JMenu mnNewMenu = new JMenu("Ventas");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem5 = new JMenuItem("Vender");
		JMenuItem mntmNewMenuItem6 = new JMenuItem("Generar reportes");
		mnNewMenu.add(mntmNewMenuItem5);
		mnNewMenu.add(mntmNewMenuItem6);
	}
	
	private void addMenuConfig() {
		JMenu mnNewMenu = new JMenu("Configuracion");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem7 = new JMenuItem("Configurar descuentos");
		JMenuItem mntmNewMenuItem8 = new JMenuItem("Configurar obsequios");
		JMenuItem mntmNewMenuItem9 = new JMenuItem("Configurar cantidad optima");
		JMenuItem mntmNewMenuItem10 = new JMenuItem("Configurar cuota diaria");
		mnNewMenu.add(mntmNewMenuItem7);
		mnNewMenu.add(mntmNewMenuItem8);
		mnNewMenu.add(mntmNewMenuItem9);
		mnNewMenu.add(mntmNewMenuItem10);
	}
	
	private void addMenuAyuda() {
		JMenu mnNewMenu = new JMenu("Ayuda");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem11 = new JMenuItem("Acerca de Tienda");
		mnNewMenu.add(mntmNewMenuItem11);
	}

}
