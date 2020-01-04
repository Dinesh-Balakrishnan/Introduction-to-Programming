# Managing Processes

```bash
    kill -SIGKILL PID
    kill -9 PID
```

The kill command with the 'signal kill' tag kills a process of the specified PID. It is only possible to kill your own processes, unless sudo is used. 

```bash
    nice -n <num> command
    renice -n <num> PID
```

The 'nice' command is used to set priority to terminal commands, while the 'renice' command is used to set priority to existing processes. The value range is from -19 to 20, -19 being the highest priority and 0 being the default priority. 

```bash
    command &

    bg 
    bg %job-ID

    fg
    fg %job-ID
```

It is possible to run a command in the background by including an ampersand at the end. Additionally, the 'background' command resumes the last or specified job in the background. The 'foreground' command will resume the most recently suspended or backgrounded job in the foreground. 

**NOTE:** While on the terminal, CTRL-Z suspends a foreground job while CTRL-C terminates it.

```bash
    at <time>
    at <time> <script-pathname>
    atq
    at -c <job-ID>
    atrm <job-ID>
```

The 'at' utility is useful for scheduling one time tasks. After entering the command and it's execution time, the user will be able to type various commands to be executed later. Press Ctrl-D to escape this editor. 'at queue' shows processes waiting to execute and their respective job IDs. The ID can then be used to see a job's commands with the 'command' tag and can be removed using the 'at remove' command.

**Examples of Specifying Time for 'at':**
* now + 30 minutes
* now + 3 weeks
* 2:30 PM October 18 2020

```bash
    crontab -e
```

'cron' is a time-based scheduling utility program. 'crontab' simply stands for 'cron table'. The above command will launch an editor to edit this table, each line containing the following fields:

| Field        | Values           |
| ------------ | ---------------- |
| Minute       | 0-59             |
| Hour         | 0-23             |
| Day of Month | 1-31             |
| Month        | 1-12             |
| Day of Week  | 0-6 (0 = Sunday) |
| Command      |                  |

**Examples:**
* **\* \* \* \* \* ~/script.sh** - This entry will execute *script.sh* every minute of every hour of every day of the month, and every month and every day in the week. 
  
* **30 08 10 06 1-5 ~/script.sh** - This entry will execute script.sh at 8:30 a.m. 10-June, as long as it is a weekday.

If the computer isn't functioning during the time period specified, a program called 'anacron' will perform the task once the computer is functioning again.


```bash
    sleep 10
    sleep 10m
    sleep 10h
    sleep 10d
````

The sleep command is usually located within a bash script. The script is suspended for a specified period of time before it resumes execution. Default time is in seconds, but it can be specified or minutes, hours, or days. 