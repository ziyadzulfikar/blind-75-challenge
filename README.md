# GitHub Guide for Submitting Challenge Solutions

Welcome to the GitHub repository for coding challenges! This guide will walk you through the process of creating a branch under your name and uploading your solution files step by step. If you are new to Git and GitHub, follow these instructions carefully.

---

## 🚀 Setting Up Git and GitHub

### 1️⃣ Install Git
If you haven't installed Git yet, download and install it from [Git's official website](https://git-scm.com/downloads).

### 2️⃣ Create a GitHub Account
If you don’t have a GitHub account, create one at [GitHub](https://github.com/).

### 3️⃣ Fork the Repository
1. Go to the repository URL shared by your instructor.
2. Click on the **Fork** button in the top-right corner to create a copy in your GitHub account.

### 4️⃣ Clone the Repository Locally
1. Open **Terminal** (Linux/macOS) or **Command Prompt/Powershell** (Windows).
2. Run the following command, replacing `your-username` with your GitHub username:
   
   ```sh
   git clone https://github.com/WeCode-Community-Dev/blind-75-challenge.git
   ```
   
3. Navigate into the repository folder:
   
   ```sh
   cd blind-75-challenge
   ```

---

## 🌿 Creating a Branch Under Your Name
Each student must create a separate branch with their name before making any changes.

1. Check the current branches:
   
   ```sh
   git branch
   ```
   
2. Create a new branch with your name (make sure this is unique - add some unique number or characters to make sure it is not already there):
   
   ```sh
   git checkout -b your-branch-name
   ```
   
3. Verify the branch was created and switched to it:
   
   ```sh
   git branch
   ```
   
   Your name should now be highlighted, meaning you are on that branch.

---

## 🔁 Setting Upstream and Pulling Latest Changes
Before working on a new challenge, ensure your repository is up to date.

1. Add the original repository as the upstream remote (only required once):
   
   ```sh
   git remote add upstream https://github.com/WeCode-Community-Dev/blind-75-challenge.git
   ```
   
2. Fetch the latest changes:
   
   ```sh
   git fetch upstream
   ```
   
3. Merge the latest changes into your branch:
   
   ```sh
   git merge upstream/main
   ```

---

## ✏️ Adding Your Challenge Solution
Upload only the solution file for each challenge (e.g., `solution.py`, `solution.cpp`, `solution.java`).
you can name the file <problem-name>.py or <problem-name>.cpp or <problem-name>.java etc. 
example: two-sum.py or two-sum.cpp or two-sum.java as per the programming language you choose

1. Navigate to the folder for the challenge you are working on.
2. Place your solution file inside the appropriate challenge folder.

Example structure:

```
repository-name/
│-- Challenge-1/
│   │-- solution.py  # Your file
│-- Challenge-2/
│   │-- solution.cpp  # Another file
```

---

## 📤 Committing and Pushing Your Code

Replace the "challenge-1" with problem name

1. Add the file you modified:
   
   ```sh
   git add Challenge-1/solution.py
   ```
   
2. Commit your changes with a meaningful message:
   
   ```sh
   git commit -m "Added solution for Challenge 1"
   ```
   
3. Push your branch to your GitHub repository:
   
   ```sh
   git push origin your-branch-name
   ```

---

## 🔄 Creating a Pull Request (Not Required)
Once you've pushed your changes, you need to create a **Pull Request (PR)**.

1. Go to your GitHub repository.
2. Switch to your branch (`your-branch-name`).
3. Click on **Compare & pull request**.
4. Add a meaningful **title** and **description**.
5. Click **Create pull request**.

Your code will now be reviewed and merged by the instructor! 🎉

---

## ❗ Important Rules
✅ Always create a branch under your name.
✅ Upload only the solution file (no unnecessary files or folders).
✅ Keep your repository updated by pulling the latest changes.
✅ Use meaningful commit messages.
✅ Create a pull request for every challenge.

Happy coding! 🚀

