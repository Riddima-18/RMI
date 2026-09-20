Java RMI (Remote Method Invocation)

A Java project demonstrating Remote Method Invocation (RMI) — a mechanism that allows an object running in one JVM to invoke methods on an object running in another JVM, enabling distributed client-server communication.

📁 Project Structure
RMI/
├── Server.java          # Implements the remote interface and registers the remote object
├── Client.java          # Looks up the remote object and invokes its methods
├── <Interface>.java     # Remote interface declaring the methods exposed to clients
└── .gitattributes

Update the file names/structure above to match your actual project layout.

🚀 Features
Demonstrates Java RMI architecture: Remote Interface → Server (Remote Object) → Client
Client invokes methods on a remote object as if it were local
Uses Java's built-in java.rmi package (no external libraries required)
🛠️ Requirements
Java Development Kit (JDK) 8 or higher
A terminal / command prompt
▶️ How to Run
Clone the repository
bash
   git clone https://github.com/<your-username>/<repo-name>.git
   cd <repo-name>
Compile all source files
bash
   javac *.java
Start the RMI registry (in one terminal window)
bash
   rmiregistry

Run this from the directory containing your compiled .class files, or make sure they're on the classpath.

Start the server (in a second terminal window)
bash
   java Server
Run the client (in a third terminal window)
bash
   java Client
📌 Notes
The RMI registry defaults to port 1099. If you're binding to a custom port, update it consistently in both Server.java and Client.java.
If running the client and server on different machines, ensure the correct hostname/IP is used in the RMI URL (e.g., rmi://<host>:1099/ServiceName) and that the port is open through any firewall.
Make sure the server (and rmiregistry) are running before starting the client.
📄 License

This project currently has no license specified. Feel free to add one (e.g., MIT) if you plan to share or open-source it.
