# Processes 

## Definitions:
  
* **Program:** A set of instructions that is used to perform a specific task. 
  
* **Process:** An instance of a program that executes a set of instructions. 

* **Foreground Process:** A process that requires a user to start or interact with it.

* **Background Process:** A process that runs independently of a user. 

* **Thread:** A processor resource allocation. Threads are assigned by the operating system to a process. These threads will be used by the scheduler. 
  
* **Scheduler:** A function that constantly picks between available threads and schedules their respective process to run on a specific core. 

* **Sleep State:** Sometimes, a process goes into a sleep state when it is waiting for some other action to occur. In this state, the process is on a wait queue and it's thread isn't picked by the scheduler.

* **Load Average:** The average CPU utilization over a period of time, taking into account process currently running and process waiting for a CPU to become available. Max average on a single-CPU system is 1.00, while max average on a quad-CPU system is 4.00.

- - - -
## Process Types:

| Process Type          | Description | Example |
| --------------------- | ----------- | ------- |
| Interactive Processes | Need to be started by a user, either at a command line or through a graphical interface such as an icon or a menu selection.  | bash, firefox, top |
| Batch Processes       | Automatic processes which are scheduled from and then disconnected from the terminal. These tasks are queued and work on a FIFO (first-in, first-out) basis. | updatedb |
| Daemons               | Server processes that run continuously. Many are launched during system startup and then wait for a user or system request indicating that their service is required. | httpd, xinetd, sshd |
| Threads               | Lightweight processes. These are tasks that run under the umbrella of a main process, sharing memory and other resources, but are scheduled and run by the system on an individual basis. An individual thread can end without terminating the whole process and a process can create new threads at any time. Many non-trivial programs are multi-threaded. | firefox, gnome-terminal-server |
| Kernel Threads        | Kernel tasks that users neither start nor terminate and have little control over. These may perform actions like moving a thread from one CPU to another, or making sure input/output operations to disk are completed. | kthreadd, migration, ksoftirqd |

- - - -

## Process IDs:

| ID Type                  | Description              |
| ------------------------ | ------------------------ |
| Process ID (PID)         | Unique Process ID number |
| Parent Process ID (PPID) | Process (Parent) that started this process. If the parent dies, the PPID will refer to an adoptive parent; on recent kernels, this is kthreadd which has PPID=2.  |
| Thread ID (TID)          | Thread ID number. This is the same as the PID for single-threaded processes. For a multi-threaded process, each thread shares the same PID, but has a unique TID. |
| Real User ID (RUID)      | Identifies the user who started the process. |
| Effective User ID (EUID) | The user who determines access rights for other users. |
| Real Group ID (RGID)     | Users can be categorized into groups. The RGID identified the group that started the process. |
| Effective Group ID (EGID) | The group who determines access rights for other users/groups. |

- - - -

## A Quick Way to View Processes

```bash
    ps axo stat,euid,ruid,tty,tpgid,sess,pgrp,ppid,pid,pcpu,comm
```

Displays all processes in a user-defined format.

```bash
    ps aux
```

Displays all processes of all users.