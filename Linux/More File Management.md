# File/Directory Management

## Comparing Files and Creating Patches

```bash
   diff [options] /file1 /file2
```

The 'diff' command is used to compare files and directories, with the following options:

| diff Option | Usage |
| ----------- | ----- |
| -c | Provides a listing of differences that include three lines of context before and after the lines differing in content. |
| -r | Used to recursively compare subdirectories, as well as the current directory. |
| -i | Ignore the case of letters. |
| -w | Ignore differences in spaces and tabs (white space). |
| -q | Be quiet: only report if files are different without listing the differences. |

```bash
   cmp /file1 /file2
```

Used for comparing binary files.

```bash
   diff3 /file1 /common-file /file2
```

Used for comparing three different files.

```bash
   diff -Nur /originalfile /newfile > /patchfile
```

With the correct arguments, the 'diff' command can be used to create a patch file.

```bash
   patch -p1 < /patchfile
   patch /originalfile /patchfile
```

The first method applies changes to an entire directory tree, while the second one applies patches to just a single file. 

- - - - -

## Copying Files

```bash
   cp /originalfile /newfile
   rsync /originalfile /newfile

   cp -r /originaldir /newdir
   rsync -r /originaldir /newdir

   rsync --progress -avrxH  --delete /originaldir /newdir
```

Both the 'copy' and 'remote synchronization' commands copy files and directories, but the 'rysnc' command only copies files that don't exist and changes parts of files that are different. 'rsync' also has the ability to copy files over a network. The recursive tag is very efficient on 'rsync' because it only transmits changes. A good combination of tags is shown on 'rsync' above.

- - - - -

## Compressing Files

```bash
   gzip /filename
   gzip -r /dirname

   gzip -d /filename
   gunzip /filename
```

'gzip' compresses both files and directories. The compressed '.gz' file can then be decompressed with both the 'decompress' flag or 'gunzip'.

```bash
   bzip2 /filename
   bzip2 /dirname

   bzip2 -d /filename
   bunzip2 /filename
```

'bzip2' is a compression method that produces even smaller files than 'gzip'. The files can be decompressed with the 'decompress' flag or 'bunzip2'.

```bash
   xz /filename
   xz /dirname

   xz -d /filename
   xz -dcf /file1 /file2 > /newfile
```

'xz' is the most efficient compression method that takes the longest to compress. It is now used to store archives or the Linux kernel. It has the 'decompress' flag like the other commands. The command also has the ability to decompress both compressed and uncompressed files to a standard output in a single command.

```bash
   zip /newfile /originalfile
   zip -r /newdir /originaldir

   unzip /filename
```

'zip' is a legacy program only really used in Linux when receiving a zipped file from a Windows user. Zipping files involves specifing a new 'zip' file pathname, instead of simply replacing the extension of current filenames. 

```bash
   tar zcvf mydir.tar.gz mydir
   tar jcvf mydir.tar.bz2 mydir
   tar Jcvf mydir.tar.xz mydir

   tar xvf mydir.tar
```

'tar' historicallly stands for 'tape archive', and was used to archive files to a magnetic tape. It allows the user to extract files from an archive file called a 'tarball'. It can use the 'gzip', 'bzip2', and 'xz' compression methods as shown by the first three code lines respectively.


