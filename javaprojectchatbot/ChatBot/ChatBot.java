package ChatBot;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatBot extends JFrame implements ActionListener
{
	static JTextArea area=new JTextArea();
	JTextField field=new JTextField();
	JScrollPane sp;
	JButton send;
	LocalTime time=LocalTime.now();
	LocalDate date=LocalDate.now();
	Random random=new Random();

	public ChatBot(String title)
	{
		super(title);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(true);
		getContentPane().setBackground(Color.green);
		field=new JTextField();
		send=new JButton(">");
		send.setFont(new Font("Serif",Font.BOLD,25));
		send.setBackground(Color.white);
		send.setBounds(735,520,50,35);
		add(send);
		//For Text area
		area.setEditable(false);
		area.setBackground(Color.white);
		add(area);
		area.setFont(new Font("Serif",Font.PLAIN,20));
		//scrollbar
		sp=new JScrollPane(area,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setBounds(10,20,775,470);
		add(sp);
			
		//For TextField
		field.setSize(725,35);
		field.setLocation(10,520);
		field.setForeground(Color.black);
		field.setFont(new Font("Serif",Font.BOLD,25));
		add(field);
		
		send.addActionListener(this);
		getRootPane().setDefaultButton(send);
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String message=field.getText().toLowerCase();
	   
		area.append("You : "+field.getText()+"\n");
		field.setText("");
		Socket sock=new Socket();
		
		
		if(message.contains("how are you"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot("I'm fine !,What about you ? ");
			}
			else if(num==1)
			{
				bot("I am good , thanks for asking !");
			}
			else 
			{
				bot("I am great ,thanks for asking !");
			}
		
		}
		else if(message.contains("you")&&(message.contains("smart")||message.contains("good")))
		{
			bot("Thank you !");
		}
		else if(message.contains("welcome"))
		{
			bot("You are so polite.How can i help you ?");
		}
		
		else if(message.contains("Who")||message.contains("made")||message.contains("invented")||message.contains("created"))
		{
			
			int num=random.nextInt(3);
			if(num==0)
			{
			bot("Priyanshu Sir");
			}
			else if(num==1)
			{
				bot("Aniket Sir");
			}
			else if(num==2)
			{
				bot("Abhishek Sir");
			}
			else if(num==3)
			{
				bot("Priyanshu Sir");
			}
		}
		else if(message.contains("by"))
		{
			bot("Byy,See you soon ..!");
		}
		else if(message.contains("i am good")||message.contains("i am great")||message.contains("i am ")&&message.contains("fine"))
		{
			
			bot("Good to hear.");
		}
		else if(message.contains("thank"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot("Welcome..");
			}
			else if(num==1)
			{
				bot("My plesure");
			}
			else if(num==2)
			{
				bot("Happy to help");
			}
			else if(num==3)
			{
				bot("That's why i'm here for..");
			}
		}
		else if(message.contains("What is the speed of light?") ||message.contains("light")||message.contains("speed"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot("The speed of light is approximately 299,792,458 meters per second.\n");
			}
			else if(num==1)
			{
				bot("The speed of light is approximately 3*10^8 m/s.\n");
			}
			else 
			{
				bot("The speed of light is approximately 300000 Km/s.\n");
			}
		
		}
		else if(message.contains("What is DNA?") ||message.contains("DNA")||message.contains("dna"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot("DNA is a molecule that carries most of the genetic instructions used \n in the development and functioning of all living organisms.\n");
			}
			else if(num==1)
			{
				bot("DNA, or deoxyribonucleic acid, is the hereditary material in \n humans and almost all other organisms. Nearly every cell\n in a person’s body has the same DNA. Most DNA is located in \nthe cell nucleus (where it is called nuclear DNA), but a small amount of DNA can also be \nfound in the mitochondria (where it is called mitochondrial DNA or mtDNA).\n");
			}
			else 
			{
				bot("The chemical DNA was first discovered in 1869, \nbut its role in genetic inheritance was not demonstrated until 1943.\nEach strand of a DNA molecule is composed of a long chain of monomer \nnucleotides. The nucleotides of DNA consist of a deoxyribose sugar molecule \nto which is attached a phosphate group and one of four nitrogenous bases:\n two purines (adenine and guanine) and two pyrimidines (cytosine and thymine). \n");
			}
		
		}
		else if(message.contains("What is artificial intelligence?") ||message.contains("artificial")||message.contains("intelligence"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot("Artificial intelligence is a field of computer science \n"
					+ "that focuses on the development of intelligent machines that\n"
					+ " can perform tasks that typically require human intelligence,\n "
					+ "such as visual perception, speech recognition,\n"
					+ " decision-making, and language translation.\n");
			}
			else if(num==1)
			{
				bot("Artificial intelligence is the simulation of human intelligence\n"
			+ " processes by machines, especially computer systems. Specific \n"
			+ "applications of AI include expert systems, natural language processing, \n"
			+ "speech recognition and machine vision.\n");
			}
			else 
			{
				bot("Artificial intelligence (AI), is the ability of a digital computer\n"
						+ " or computer-controlled robot to perform tasks commonly\n"
						+ " associated with intelligent beings.\n");
			}
		
		}
		else if(message.contains("What is the difference between a photon and an electron?") ||message.contains("photon")||message.contains("electron"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot("Photons are particles of light that travel at the speed of light \nand have no mass, while electrons are negatively charged particles that have mass and are found in atoms.\n");
			}
			else if(num==1)
			{
				bot("An electron is a subatomic particle that plays a vital role in almost\n"
				+ " everything. The photon is a conceptual packet of energy, which is very \n"
				+ "important in quantum mechanics. Electron and photon are two concepts that\n"
				+ " developed greatly with the development of quantum mechanics.\n");
			}
			else 
			{
				bot("The key difference between photon and electron is that photon is a packet"
						+ " of energy while the electron is a mass. \n");
			}
		
		}
		else if(message.contains("What is the difference between 4g and 5g wireless networks?") ||message.contains("4g")||message.contains("5g"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot("5G wireless networks are the next generation of cellular networks \n"
					+ "that promise faster data speeds, lower latency, and more reliable connections \n"
					+ "compared to 4G networks. 5G networks also have the potential to support a wider \n"
					+ "range of devices and applications, including the Internet of Things (IoT) and autonomous vehicles.\n");
			}
			else if(num==1)
			{
				bot("The biggest difference between 4G and 5G is latency. 5G promises low latency \n"
				+ "under 5 milliseconds, while 4G latency ranges from 60 ms to 98 ms. In addition, \n"
				+ "with lower latency comes advancements in other areas, such as faster download speeds.\n");
			}
			else 
			{
				bot("While 4G introduced various VoIP capabilities, 5G builds upon and enhances those \n"
					+ "promises of quick potential download speeds. 4G's download speeds hit 1 Gbps, and \n"
					+ "5G's goal is to increase that tenfold for maximum download speeds of 10 Gbps.\n"
						+ "");
			}
		
		}
		else if(message.contains("What is the difference between a cpu and a gpu?") ||message.contains("cpu")||message.contains("gpu"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot("A CPU (central processing unit) is the main processing chip in a \n"
					+ "computer, responsible for executing instructions and performing calculations.\n"
					+ " A GPU (graphics processing unit) is a specialized chip designed to handle the \n"
					+ "complex calculations required for rendering graphics and images.\n");
			}
			else if(num==1)
			{
				bot("The CPU (Central Processing Unit) is a microprocessor used to execute the program \n"
				+ "instructions and corresponding operations such as arithmetic, logic, I/O, control, etc.\n"
				+ " It primarily emphasises low latency.\n"
			+ "In contrast, the GPU (Graphics Processing Unit) is devised to render images, especially in gaming.\n "
			+ "It primarily focuses on high throughputs.\n");
			}
			else 
			{
				bot("A single GPU consists of thousands of cores that are clocked at a frequency of \n"
				+ "approximate 1GHz of frequency. On the other hand, a CPU contains less-number of cores\n"
				+ " that are clocked at a frequency of 2-3 GHz.\n");
			}
		
		}
		else if(message.contains("What is quantum computing?") ||message.contains("quantum")||message.contains("computing"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot("Quantum computing is a type of computing that uses quantum bits (qubits) instead\n "
				+ "of traditional bits to perform calculations. This allows quantum computers to\n"
				+ " perform certain types of calculations much faster than traditional computers.\n");
			}
			else if(num==1)
			{
				bot("Quantum computing is a rapidly-emerging technology that harnesses the laws of\n"
						+ " quantum mechanics to solve problems too complex for classical computers.\n ");
			}
			else 
			{
				bot("Quantum computing solves mathematical problems and runs quantum models using \n"
				+ "the tenets of quantum theory. Some of the quantum systems it is used to model\n "
				+ "include photosynthesis, superconductivity and complex molecular formations.\n");
			}
		
		}
		else if(message.contains("What is blockchain technology?") ||message.contains("blockchain")||message.contains("technology"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot("Blockchain technology is a decentralized digital ledger that records transactions \n"
				+ "securely and transparently. It has the potential to revolutionize industries such\n "
				+ "as finance, healthcare, and supply chain management.\n");
			}
			else if(num==1)
			{
				bot("Blockchain is a shared, immutable ledger that facilitates the process of recording\n"
						+ " transactions and tracking assets in a business network.\n ");
			}
			else 
			{
				bot("Blockchain is a system of recording information in a way that makes it difficult or\n "
						+ "impossible to change, hack, or cheat the system.\n"
						+ "A blockchain is essentially a digital ledger of transactions that is duplicated and\n "
						+ "distributed across the entire network of computer systems on the blockchain.\n "
						+ "Each block in the chain contains a number of transactions, and every time a new transaction\n "
						+ "occurs on the blockchain, a record of that transaction is added to every participant’s ledger.\n");
			}
		
		}
		else if(message.contains("What is the Internet of Things (IoT)?") ||message.contains("internet")||message.contains("things"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot("The Internet of Things (IoT) describes the network of physical objects—“things”—that are embedded\n"
					+ " with sensors, software, and other technologies for the purpose of connecting and exchanging\n "
					+ "data with other devices and systems over the internet.\n");
			}
			else if(num==1)
			{
				bot("The Internet of Things (IoT) refers to the network of physical devices, vehicles, home \n"
						+ "appliances, and other items embedded with electronics, software, sensors, and\n "
						+ "connectivity, which enables these objects to connect and exchange data.\n");
			}
			else 
			{
				bot("The Internet of Things (IoT) refers to the network of physical devices, vehicles, home appliances,\n"
						+ " and other items embedded with electronics, software, sensors, and connectivity, which enables\n "
						+ "these objects to connect and exchange data.\n");
			}
		
		}
		else if(message.contains("What is a black hole?") ||message.contains("black")||message.contains("hole"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot("A black hole is a region of space with a gravitational pull so strong that nothing, not \n"
					+ "even light, can escape it.\n");
			}
			else if(num==1)
			{
				bot("A black hole is an area of such immense gravity that nothing—not even light—can escape\n"
						+ " from it. Black holes form at the end of some stars' lives. The energy that held\n"
						+ " the star together disappears and it collapses in on itself producing a magnificent\n"
						+ " explosion.\n");
			}
			else 
			{
				bot("A black hole is a cosmic body of extremely intense gravity from which even light\n "
						+ "cannot escape. Black holes usually cannot be observed directly, but they\n "
						+ "can be “observed” by the effects of their enormous gravitational fields on\n "
						+ "nearby matter.\n");
			}
		
		}
		else if(message.contains("What is virtual reality (VR)?") ||message.contains("virtual")||message.contains("reality"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot("Virtual reality (VR) is a computer-generated simulation that immerses the user in a \n"
					+ "simulated environment. It has applications in fields such as gaming, education, and\n"
					+ " training.\n");
			}
			else if(num==1)
			{
				bot("Virtual Reality (VR) is a computer-generated environment with scenes and objects that appear\n"
				+ " to be real, making the user feel they are immersed in their surroundings. This environment is\n "
				+ "perceived through a device known as a Virtual Reality headset or helmet.\n");
			}
			else 
			{
				bot("Virtual Reality, or VR, is the use of computer technology to create a simulated environment \n"
						+ "which can be explored in 360 degrees. Unlike traditional interfaces, VR places the user\n "
						+ "inside the virtual environment to give an immersive experience.\n");
			}
		
		}
		else if(message.contains("What is nanotechnology?") ||message.contains("nanotechnology")||message.contains("nanotech"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot(" Nanotechnology is the study and manipulation of matter at the nanoscale \n"
				+ "(one billionth of a meter), which has applications in fields such as medicine, \n"
				+ "electronics, and materials science.\n");
			}
			else if(num==1)
			{
				bot("Nanotechnology refers to the branch of science and engineering devoted to designing,\n"
				+ " producing, and using structures, devices, and systems by manipulating atoms and molecules\n"
				+ " at nanoscale, i.e. having one or more dimensions of the order of 100 nanometres (100 millionth\n"
				+ " of a millimetre) or less.\n");
			}
			else 
			{
				bot("Nanotechnology involves the understanding and control of matter at the nanometer-scale.\n"
				+ " The so-called nanoscale deals with dimensions between approximately 1 and 100 nanometers. \n"
				+ "A nanometer is an extremely small unit of length—a billionth (10-9) of a meter.\n");
			}
		
		}
		else if(message.contains("What does an artificial intelligence (AI) programmer for games do?") ||message.contains("programmer")||message.contains("games"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot(" AI programmers create the brains of the game. The non-playable characters (NPCs - the ones\n"
				+ " that are not controlled by a player) need to make decisions and behave in ways that are\n"
				+ " believable, exciting and present the player with varying degrees of challenge.\n");
			}
			else if(num==1)
			{
				bot( "AI in gaming refers to responsive and adaptive video game experiences. These \n"
				+ "AI-powered interactive experiences are usually generated via non-player characters,\n "
				+ "or NPCs, that act intelligently or creatively, as if controlled by a human game-player. \n"
				+ "AI is the engine that determines an NPC's behavior in the game world.\n");
			}
			else 
			{
				bot( "In video games, artificial intelligence (AI) is used to generate responsive, adaptive\n"
					+ " or intelligent behaviours primarily in non-player characters (NPCs) similar to \n"
					+ "human-like intelligence. It serves to improve the game-player experience rather than\n"
					+ " machine learning or decision making.\n");
			}
		
		}
		else if(message.contains("What is the usage of CSP in game playing?") ||message.contains("csp")||message.contains("csp"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot(" CSP represents values for all the variables as a solution so that the constraints\n "
					+ "are satisfied. For example: The 8-queens problem is referred to as CSP.\n");
			}
			else if(num==1)
			{
				bot("CSP represents values for all the variables as a solution so that the constraints \n"
						+ "are satisfied. For example: The 8-queens problem is referred to as CSP.\n");
			}
			else 
			{
				bot("CSP represents values for all the variables as a solution so that the constraints\n"
						+ " are satisfied. For example: The 8-queens problem is referred to as CSP.\n");
			}
		
		}
		else if(message.contains("What is Minimax search for game playing in AI?") ||message.contains("minimax")||message.contains("search"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot("Minimax is a kind of backtracking algorithm that is used in decision making and game theory\n"
					+ " to find the optimal move for a player, assuming that your opponent also plays optimally.\n "
					+ "It is widely used in two player turn-based games such as Tic-Tac-Toe, Backgammon, \n"
					+ "Mancala, Chess, etc.\n");
			}
			else if(num==1)
			{
				bot("Minimax is a kind of backtracking algorithm that is used in decision making and game theory\n"
						+ " to find the optimal move for a player, assuming that your opponent also plays optimally.\n "
						+ "It is widely used in two player turn-based games such as Tic-Tac-Toe, Backgammon,\n "
						+ "Mancala, Chess, etc.\n");
			}
			else 
			{
				bot("Minimax is a kind of backtracking algorithm that is used in decision making and game theory\n"
						+ " to find the optimal move for a player, assuming that your opponent also plays optimally.\n "
						+ "It is widely used in two player turn-based games such as Tic-Tac-Toe, Backgammon,\n "
						+ "Mancala, Chess, etc.\n");
			}
		
		}
		else if(message.contains("Differentiate between A * and AO * algorithm?") ||message.contains("a*")||message.contains("ao*"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot(" An A* algorithm represents an OR graph algorithm that is used to find a single solution \n"
					+ "(either this or that). An AO* algorithm represents an AND-OR graph algorithm that is used\n"
					+ " to find more than one solution by Adding more than one branch.\n");
			}
			else if(num==1)
			{
				bot(" An A* algorithm represents an OR graph algorithm that is used to find a single solution\n "
						+ "(either this or that). An AO* algorithm represents an AND-OR graph algorithm that is used\n"
						+ " to find more than one solution by Adding more than one branch.\n");
				}
			else 
			{
				bot(" An A* algorithm represents an OR graph algorithm that is used to find a single solution \n"
						+ "(either this or that). An AO* algorithm represents an AND-OR graph algorithm that is used\n"
						+ " to find more than one solution by Adding more than one branch.\n");
				}
		
		}
		else if(message.contains("What is Alpha Beta pruning in AI?") ||message.contains("alpha")||message.contains("beta"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot(" Alpha–beta pruning is a search algorithm that seeks to decrease the number of nodes that are evaluated\n"
					+ " by the minimax algorithm in its search tree. It is an adversarial search algorithm used commonly\n "
					+ "for machine playing of two-player games (Tic-tac-toe, Chess, Go, etc.).\n");
			}
			else if(num==1)
			{
				bot(" Alpha–beta pruning is a search algorithm that seeks to decrease the number of nodes that are evaluated\n"
						+ " by the minimax algorithm in its search tree. It is an adversarial search algorithm used commonly\n "
						+ "for machine playing of two-player games (Tic-tac-toe, Chess, Go, etc.).\n");
				}
			else 
			{
				bot(" Alpha–beta pruning is a search algorithm that seeks to decrease the number of nodes that are evaluated\n"
						+ " by the minimax algorithm in its search tree. It is an adversarial search algorithm used commonly\n "
						+ "for machine playing of two-player games (Tic-tac-toe, Chess, Go, etc.).\n");
				}
		
		}
		else if(message.contains("What is a self-driving car?") ||message.contains("driving")||message.contains("cars"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot("A self-driving car is a vehicle that is capable of driving itself without human \n"
					+ "intervention, using a combination of sensors, cameras, and advanced computer algorithms.\n");
			}
			else if(num==1)
			{
				bot("Self-driving vehicles are cars or trucks in which human drivers are never \n"
						+ "required to take control to safely operate the vehicle. Also known as autonomous \n"
						+ "or “driverless” cars, they combine sensors and software to control, navigate, and \n"
						+ "drive the vehicle.\n");
			}
			else 
			{
				bot("Self-driving vehicles are cars or trucks in which human drivers are never \n"
						+ "required to take control to safely operate the vehicle. Also known as autonomous \n"
						+ "or “driverless” cars, they combine sensors and software to control, navigate, and \n"
						+ "drive the vehicle.\n");
			}
		
		}
		else if(message.contains("What are latest trending technologies?") ||message.contains("latest")||message.contains("trendingtech"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot("Here are some of the Latest Emerging Technology Trends 2023 :\r\n"
					+ "Artificial Intelligence (AI) and Machine Learning (ML)\r\n"
					+ "Robotic Process Automation (RPA)\r\n"
					+ "Edge Computing\r\n"
					+ "Quantum Computing\r\n"
					+ "Virtual Reality (VR) and Augmented Reality (AR)\r\n"
					+ "Blockchain\r\n"
					+ "Internet of Things (IoT)\r\n"
					+ "5G\r\n"
					+ "Cybersecurity\r\n"
					+ "Full Stack Development\r\n"
					+ "Computing Power\r\n"
					+ "Datafication\r\n"
					+ "Digital Trust\r\n"
					+ "Internet of Behaviours\r\n"
					+ "Predictive analytics\r\n"
					+ "DevOps\r\n"
					+ "3D Printing\r\n"
					+ "AI-as-a-Service\r\n"
					+ "Genomics\n\n");
			}
			else if(num==1)
			{
				bot("Here are some of the Latest Emerging Technology Trends 2023 :\r\n"
						+ "Artificial Intelligence (AI) and Machine Learning (ML)\r\n"
						+ "Robotic Process Automation (RPA)\r\n"
						+ "Edge Computing\r\n"
						+ "Quantum Computing\r\n"
						+ "Virtual Reality (VR) and Augmented Reality (AR)\r\n"
						+ "Blockchain\r\n"
						+ "Internet of Things (IoT)\r\n"
						+ "5G\r\n"
						+ "Cybersecurity\r\n"
						+ "Full Stack Development\r\n"
						+ "Computing Power\r\n"
						+ "Datafication\r\n"
						+ "Digital Trust\r\n"
						+ "Internet of Behaviours\r\n"
						+ "Predictive analytics\r\n"
						+ "DevOps\r\n"
						+ "3D Printing\r\n"
						+ "AI-as-a-Service\r\n"
						+ "Genomics\n\n");
			}
			else 
			{
				bot("Top 18 New Technology Trends for 2023\r\n"
						+ "Computing Power\r\n"
						+ "Smarter Devices\r\n"
						+ "Datafication\r\n"
						+ "Artificial Intelligence and Machine Learning\r\n"
						+ "Extended Reality\r\n"
						+ "Digital Trust\r\n"
						+ "3D Printing\r\n"
						+ "Genomics\r\n"
						+ "New Energy Solutions\r\n"
						+ "Robotic Process Automation (RPA)\r\n"
						+ "Edge Computing\r\n"
						+ "Quantum Computing\r\n"
						+ "Virtual Reality and Augmented Reality\r\n"
						+ "Blockchain\r\n"
						+ "Internet of Things (IoT)\r\n"
						+ "5G\r\n"
						+ "Cyber Security\n\n");
			}
		
		}
		else if(message.contains("What are the top big science questions?") ||message.contains("science")||message.contains("questions"))
		{
			int num=random.nextInt(3);
			if(num==0)
			{
			bot("Here are list of big Science questions->\n"
					+ "1 What is the universe made of?\n"
					+"2 How did life begin?\n"
					+ "3 Are we alone in the universe?\n"
					+ "4 What makes us human?\n"
					+ "5 What is consciousness?\n"
					+ "6 Why do we dream?\n"
					+ "7 Why is there stuff?\n"
					+ "8 Are there other universes?\n"
					+ "9 Where do we put all the carbon?\n"
					+ "10 What’s at the bottom of the ocean?\n"
					+ "11 What’s at the bottom of a black hole?\n"
					+ "12 Is time travel possible?\n"
					);
			}
			else if(num==1)
			{
				bot("Here are list of big Science questions->\n"
						+ "1 What is the universe made of?\n"
						+"2 How did life begin?\n"
						+ "3 Are we alone in the universe?\n"
						+ "4 What makes us human?\n"
						+ "5 What is consciousness?\n"
						+ "6 Why do we dream?\n"
						+ "7 Why is there stuff?\n"
						+ "8 Are there other universes?\n"
						+ "9 Where do we put all the carbon?\n"
						+ "10 What’s at the bottom of the ocean?\n"
						+ "11 What’s at the bottom of a black hole?\n"
						+ "12 Is time travel possible?\n"
						);
				}
			else 
			{
				bot("Here are list of big Science questions->\n"
						+ "1 What is the universe made of?\n"
						+"2 How did life begin?\n"
						+ "3 Are we alone in the universe?\n"
						+ "4 What makes us human?\n"
						+ "5 What is consciousness?\n"
						+ "6 Why do we dream?\n"
						+ "7 Why is there stuff?\n"
						+ "8 Are there other universes?\n"
						+ "9 Where do we put all the carbon?\n"
						+ "10 What’s at the bottom of the ocean?\n"
						+ "11 What’s at the bottom of a black hole?\n"
						+ "12 Is time travel possible?\n"
						);
				}
		
		}
		else if(message.contains("what") && message.contains("name"))
		{
			if(message.contains("your"))
			{
				bot("I'm EchoBot...");
			}
			if(message.contains("my"))
			{
				bot("Your name is Priyanshu");
			}
		}
		else if(message.contains("change"))
		{
			bot("Sorry,I can't change anything...");
		}
		else if( message.contains("time"))
		{
		
			String ctime=new String();
			if(time.getHour()>12)
			{
				int hour=time.getHour()-12;
				ctime=ctime+hour+":"+time.getMinute()+":"+time.getSecond()+" PM";
			}
			
			else
			{
				
				ctime=ctime+time.getHour()+":"+time.getMinute()+":"+time.getSecond()+" AM";
			}
			bot(ctime);
			
			
		}
		else if(message.contains("date")||message.contains("month")||message.contains("year")||message.contains("day"))
		{
		
			String cdate=new String();
			cdate=cdate + date.getDayOfWeek()+","+date.getDayOfMonth()+" "+date.getMonth()+" "+date.getYear();
			bot(cdate);
			
			
		}

		else if(message.contains("trained"))
		{
			
				bot(" I am designed for giving answers related to Science and Technology!\n");
		
		}
		else if(message.contains("good morning"))
		{
			
				bot("Good morning,Have a nice day !");
		
		}
		else if(message.contains("good night"))
		{
			
			bot("Good night,Have a nice dreams !");
		
		}
		else if(message.contains("good evening"))
		{
			
			bot("Good Evening ...!");
		
		}
		else if(message.contains("good") && message.contains("noon"))
		{
			
			bot("Good Afternoon ...!");
		
		}
		
		else if(message.contains("clear")&&(message.contains("screen")||message.contains("chat")))
		{
			bot("wait a few second...");
			area.setText("");
		}
		else
		{
			try
			{
				try
				{
					URL url=new URL("https://google.co.in");
					URLConnection connection=url.openConnection();
					connection.connect();
					bot("Here some results for you ...");
					java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://www.google.com/search?hl=en&q="+message.replace(" ", "+")+"&btnG=Google+Search"));
			
				}
				catch(Exception ee)
				{
					bot("Connect with internet connection for get better results...");
				}
				
			}
			catch(Exception eee)
			{
				int num=random.nextInt(3);
				if(num==0)
				{	
					
				bot("Sorry ,I can't understand you !");
				}
				else if(num==1)
				{
					bot("Sorry,I don't understand ");
				}
				else if(num==2)
				{
					bot("My apologies...I don't understand ");
				}
			}
		}
		
	}
	public static void bot(String message)
	{
		area.append("Bot : "+message+"\n");
	}
	public static void main(String[] args) 
	{
		
		ChatBot cb=new ChatBot("Echo Bot");
		cb.setSize(800,605);
		cb.setLocation(50,50);
		
	}
	

}
