# Navigating the Filesytem

## Viewing Contents

**Note:** Linux absolute pathnames start with '/', which represents the root directory. Parent and child directories are also seperated with '/'.

```bash
   pwd 
```
**present working directory:** 'pwd' diplays the current working directory.

```bash
   tree
   tree -d 
```

The tree package may not be present in some OS such as Ubuntu, but can be downloaded easily using the package manager. It shows a tree view of directories and files starting from the current directory. The 'directories' flag is used to supress listing file names.

```bash
   ls
   ls -la
   ls -l filename 
```

**list:** Lists the contents of the working directory, not including sub-directories. Hidden files can also be displayed with the 'all' flag, while extra details can be displayed with the 'long' flag. Details about a specific file can be displayed by passing in a filename as an argument and using the 'long' option.

- - - -

## Changing Directories

```bash
   cd
   cd ~ 
```

**change directory:** Both operations change the current working directory to the home directory.

```bash
   cd .. 
   cd -
```

**change directory:** The first command changes to the parent directory. The second command changes to the previous working directory. 

```bash
   cd pathname
```

**change directory:** 'cd' can be used to change to a specific directory by using either relative or absolute pathnames.

```bash
    pushd .
    popd
```
**push directory, pop directory:** 'pushd' and 'popd' are stack commands. 'pushd' pushes the specified directory into a stack, the example pushing the current directory. 'popd' removes the last pushed directory from the stack, also navigating to that directory. 


