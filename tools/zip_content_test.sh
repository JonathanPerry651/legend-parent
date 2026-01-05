#!/bin/bash
set -e
zip_file="tools/test_zip.zip"
unzip -l "$zip_file" | grep "file1.txt"
unzip -l "$zip_file" | grep "subdir/file2.txt"

empty_zip_file="tools/test_empty_zip.zip"
# Verify it is a valid zip file using Python (unzip warns on empty zip)
python3 -c "import zipfile, sys; sys.exit(0 if zipfile.is_zipfile('$empty_zip_file') else 1)"
python3 -c "import zipfile, sys; z = zipfile.ZipFile('$empty_zip_file'); sys.exit(0 if len(z.namelist()) == 0 else 1)"
