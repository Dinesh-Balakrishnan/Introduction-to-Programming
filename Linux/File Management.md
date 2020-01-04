# File/Directory Management

## Viewing Files
```bash
   cat filename
   tac filename 
```

**concatenate:** While many filenames can be passed as arguments into 'cat' to join them together, the command also displays files. This should only be used for short files as scroll-back isn't provided. 'tac' views a file backward by starting with the last line.

```bash
   less filename 
```

'less' is used to view larger files because it is a paging program. It pauses at each screen of full text and provides scroll-back capabilities. While viewing a file, '/' can be used to search for a pattern from the beginning and '?' from the end.

```bash
   head filename
   tail filename
   head -n <number> filename
   tail -f filename
```

'head' and 'tail' view the first and last 15 lines of a file respectively. A whole number n can be passed as an option to change the number of lines displayed. The 'follow' tag on tail will continuously display new lines added to a file.

```bash
   file filename
```

The 'file' command can be used to find out the filetype of a specified file. The filetype cannot be understood if the required
packages for the filetype are not installed. Extensions are simply used for user understanding and aren't used by the system.

- - - -

## Creating and Removing Files

```bash
   touch filename 
   touch -t <time> filename
```

Creates an empty file. The 'time' flag can be used to specify the time for the file and can modify the time on existing files. The format for the time is -t [YY]MMddhhmm[.ss]

```bash
    mv filename pathname/filename
```

**move:** If the path ends in a directory, the file is moved to the specified directory. If the path ends with a filename, the file is moved and renamed. Because of such functionality, the file can be renamed by simply providing the new filename in the same directory.

```bash
    mkdir pathname
```

**make directory:** Makes a directory at the specified pathname, the pathname including the new directory.

```bash
    rmdir pathname
```

**remove directory:** Removes a directory at the specified pathname, the pathname including directory. The directory must be empty, or the command will fail.

```bash
    rm filename
    rm -f filename
    rm -ri filename/pathname
```

**remove:** Removes the specified files, and recursively removes the specified directories with the 'recursive' tag. The 'forcefully' tag won't prompt the user when nonexistent/write-protected arguments are being removed. The 'interactive' tag prompts the user which files are being removed when recursively remove files and directories.

- - - - -

## Links

A link in Linux is a pointer to a file or directory. There are two types of links: **hard links** and **soft links**.

### Hard Links

Hard links are assigned the same inode (index node) value of the original, meaning they have the same metadata and reference the same physical file location. Hard links will still reference the same file, even if the original file has been moved or deleted. 

**NOTE:** Modifying a filename may break the link and result in the creation of two objects, depending on the editor. Most editors, such as vi and gedit, and the 'mv' command will not break links. 

```bash
   ln original-filename new-filename
```

### Soft Links

Soft links are created with the 'soft' option. The link is strictly a pointer containing a pathname and has a different inode value than the originial. While moving or deleting a file/directory will break the link, soft links can point to objects on different filesystems, partitions, disks, and other media. Think of soft links like Windows shortcuts.

```bash
   ln -s original-filename new-filename
```

- - - - -