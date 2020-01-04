# Viewing Processes

```bash
    uptime
    w    
```

Both 'uptime' and 'who' display CPU utilization data. In order, they display: command execution time, how long the system has been running, and three load averages for 1, 5, and 15 minutes. The 'who' command also displays information about each user logged into the system:

* **USER:** User name.

* **TTY:** Terminal being used. 

* **FROM:** The remote host name or IP address.

* **LOGIN@:** Login time.

* **IDLE:** Idle time.

* **JCPU:** Total CPU time used since login.

* **PCPU:** CPU time of the current process.

* **WHAT:** Current running process on the CPU.

```bash
    jobs
    jobs -l
```

The 'jobs' command displays the status of all processes started in the current shell environment. It shows the job ID, process state, and command name. Using the 'long' tag also displays each job's PID. 

**NOTE:** One terminal will not display the jobs started in another terminal. 

```bash
    ps
    ps -u
    ps -e
    ps -eLf
```

The 'processes' command displays all process running under the current shell. The 'user' tag displays processes running for a specified user, while the 'every process' tag displays all processes running on the system. The 'light-weight process' tag shows threads for the processes, while the 'full' tag shows each process in full detail.

```bash
   pstree  
```

'process tree' displays the processes running on the system in the form of a tree diagram. Repeated entries of a process aren't displayed, and threads are displayed in curly braces.

```bash
    top
```

The 'table of processes' command works similarily to the 'processes' command, except it gives real-time updates every 2 seconds. In addition, it displays a lot more information:

* **1st Line:** Same as 'uptime' and 'who'.

* **2nd Line:** The number of processes that are running, sleeping, stopped, or are in a zombie state.

* **3rd Line:** Displays CPU time divided by users (us) and the kernel (sy). Then, displays the % of user jobs at a lower priority, CPU idleness (id), and % of waiting jobs for I/O (wa). Lastly, displays the % of software and hardware interrupts (hi and si), plus steal time (st).

* **4th and 5th Lines:** Displays memory useage, line 4 displaying RAM and line 5 displaying swap space.

* **Process Descriptions:**
    * Process Identification Number (PID)
    
    * Process owner (USER)
    
    * Priority (PR) and nice values (NI)
    
    * Virtual (VIRT), physical (RES), and shared memory (SHR)
    
    * Status (S)
    
    * Percentage of CPU (%CPU) and memory (%MEM) used
    
    * Execution time (TIME+)
    
    * Command (COMMAND).

* **Interactive Keys:**
    | Command | Output                                                    |
    | ------- | --------------------------------------------------------- |
    | t       | Display or hide summary information (rows 2 and 3)        |
    | m       | Display or hide memory information (rows 4 and 5)         |
    | A       | Sort the process list by top resource consumers           |
    | r       | Renice (change the priority of) a specific processes      |
    | k       | Kill a specific process                                   |
    | f       | Enter the top configuration screen                        |
    | o       | Interactively select a new sort order in the process list |