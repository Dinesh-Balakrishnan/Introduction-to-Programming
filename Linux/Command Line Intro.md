# Introduction to The Command Line

## Main Benefits

1. No GUI overhead is incurred.
   
2. Scripts can be made to automate tasks and series of procedures. 
   
3. It is possible to sign into remote machines on the Internet.

4. 6 console-based virtual terminals (VTs) are automatically enabled, compared to a single graphic VT.

- - - -

## General Syntax

* **Command:** The name of the program that is being executed.
>EX: ls

* **Options:** Options modify what a command will do, and start with either one or two dashes. This is to differentiate them from arguments.
>EX: ls -l (One argument), ls -la (Two arguments)

* **Arguments:** Arguments are parameters upon which a command executes. 
>EX: touch file.txt (file.txt is the argument)

* **Note:** Some commands don't need arguments or options to execute, and most arguments accept many arguments and options.

- - - -

## Common Commands and Keywords

**NOTE:** To exit a currently running process on the terminal, press the 'q' key. 

```bash
    sudo command
```
**super user do:** The sudo keyword can be thought of as admin access. It removes restrictions on certain commands and stops constantly warning the user when important file changes are being made. The 'root', 

```bash
    sudo systemctl start gdm
    sudo systemctl stop gdm
```

**system control:** Systems running on systemd can use the systemctl keyword, which allows for the user to start and stop processes much easier. The above commands start and stop the graphical display manager.

```bash
   ssh username@remote-server.com 
```

The **Secure Shell (SSH)** utility allows the user to connect to remote systems. The syntax specifies which user to connect to on the remote server.

```bash
   shutdown (or poweroff)
   shutdown -h (or halt)
   shutdown -r (or reboot)
   shutdown now "Message"
```

The first 3 commands respsectively shutdown, halt, and reboot the system. The time of the shutdown and message can be specified as an argument, the time either being "now" or in "hh:mm" military format. 

```bash
   which command
   whereis command 
```
The 'which' keyword locates the file location of the command executable. 'whereis' functions like 'which,' except it searches a larger range of system directories and contains the file locations for man pages (Documentation) plus source code.

```bash
   bash
   exit
```

**bash**: Starts a new bash shell. To leave the bash shell run the 'exit' command.

```bash
   history
```

**history**: Lists previously executed commands, which is stored in '~/.bash_history'. If multiple terminal sessions are open, the commands typed in a session aren't saved until that session is closed.