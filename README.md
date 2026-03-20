# Email Address Extractor

## Description
This Java program extracts email addresses from each line of input text and outputs them in JSON format.

## Features
- Extracts multiple emails per line
- Handles lines with no emails
- Outputs a JSON array for easy integration

## Usage
1. Compile the program:
```bash
javac src/Solution.java

Run the program:

java src.Solution

Input multiple lines. Press Ctrl+D (Linux/macOS) or Ctrl+Z (Windows) to end input.

Example:

Contact test@demo.com
No email here
admin@site.org and dev@site.io

Output:

[{"emails":["test@demo.com"]},{"emails":[]},{"emails":["admin@site.org","dev@site.io"]}]

---

### 4️⃣ Optional .gitignore**

class
.log


---

✅ GitHub Notes:

- Make sure the `src` folder is inside your repository.
- You can push using:

```bash
git init
git add .
git commit -m "Initial commit: Email Extractor"
git branch -M main
git remote add origin <your-github-repo-url>
git push -u origin main
