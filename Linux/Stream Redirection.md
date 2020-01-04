# Stream Redirection (I/O Redirection)

There are three standard file streams available for use when executing commands:

| Name            | Symbolic Name | Value | Example  |
| --------------- | ------------- | ----- | -------- |
| standard input  | stdin         | 0     | keyboard |
| standard output | stdout        | 1     | terminal |
| standard error  | stderr        | 2     | log file |

- - - -

```bash
    command < filename
```
'<' changes the input source for 'command' to the contents of the specified file.

```bash
    command > filename
    command 2> filename
    command &> filename
```
'>' changes the output of 'command' to the specified file, while '2>' will change the error output to the specified file. '&>' will do both.

```bash
    command >> filename
    command 2>> filename
    command >> filename 2>&1
```
Sometimes, we want to append data to a file instead of rewriting the entire file. These commands achieve this for 'stdout', 'stderr', and both respectively.

```bash
   command < filename1 > filename2 
```
The above code is an example of how both input and output can be combined. 'filename1' is the input to 'command', while 'filename2' will contain the output from 'command'.

```bash
    cat << token > filename
```

The input redirector (<<) is usually used with the 'concatenate' command. It states that the current input stream can be used as input until the specified token is encountered. 

- - - -

In addition to redirecting input/output from files and commands, it is also possible to input the results of one command into another using pipes:

```bash
   command1 | command2 | command3 
```

## Filters

Filters are simply programs that accept textual data and then transform it in a particular way. These are usually commands that can also function by themselves. Here are some filters in action:

```bash
    ls -l ~ |
    grep -v "^d" |
    awk '{print $5, $8, $3, $6, $7}' |
    sort -nr
```

'grep', which stands for 'globally search a regular expression and print', with the 'inverse' tag removes all lines that start with 'd' from the ls command. This means all directories are removed.

```bash
    grep -v "^d"
```

'awk', which stands for 'Aho, Keringhan, and Weinberger' (Creators), is used formatting each line. Here, the order of the data is changed by targeting the placement of each field. A field is an entity delimited by a whitespace character.

```bash
    awk '{print $5, $8, $3, $6, $7}'
```

Lastly, sort obviously sorts the lines in order. It actually sorts the line in reverse numerical order because of the 'numeric-sort' and 'reverse' tag.

```bash
    sort -nr
```

Some other useful filters are:

  * **tr:** Stands for 'translate'. Converts or deletes specified characters.

  * **sed:** Stands for 'stream edit'. Works similarily to 'tr', but uses regex for more complex operations.

  * **tee:** Splits a I/O stream between stdout and a file. Assuming stdout is the terminal window, the stream will print to the console and be saved in a file.
    ```bash
        ls -l | tee filename
    ```