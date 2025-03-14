# Jenkins Shared Library
This repository contains a Jenkins shared library created for practice and learning purposes. The library includes reusable pipeline functions and custom scripts to streamline Jenkins workflows.

## 📘 Purpose
This library is designed **only for practice and learning Jenkins**. It is not intended for production use.

## 🚀 How to Use This Shared Library in Jenkins

Follow the steps below to integrate this shared library into your Jenkins instance.

### Step 1: Upload the Repository to GitHub
Push your shared library code to a GitHub repository.

### Step 2: Configure the Shared Library in Jenkins

1. **Log in to Jenkins:** Access your Jenkins dashboard.
2. **Navigate to Manage Jenkins:** Click on the left sidebar.
3. **Go to Configure System:** Scroll down to the "Global Pipeline Libraries" section.
4. **Add a New Library:**
   - **Library Name:** (Choose a name for your library, e.g., `my-shared-library`)
   - **Default Version:** (Pick a branch or tag, e.g., `main`)
   - **Retrieval Method:** Select *Modern SCM*
   - **Source Code Management:** Choose *Git*
   - **Repository URL:** Add your GitHub repository URL

### Step 3: Use the Library in Your Pipeline

After configuring the shared library, use it in your Jenkinsfile like this:

```groovy
@Library('my-shared-library') _

pipeline {
    agent any

    stages {
        stage('Example') {
            steps {
                hello()  // Example function from your shared library
            }
        }
    }
}
```

> **Note:** Replace `my-shared-library` with your configured library name and `hello` with a valid function from your library.

## 📂 Folder Structure (Example)
```
.
├── vars
│   └── hello.groovy
└── README.md
```

### Example `hello.groovy`
```groovy
def call() {
    echo 'Hello, World from Jenkins Shared Library!'
}
```

## 📈 Future Updates
- More reusable functions and steps will be added to the library.
- Enhanced examples and complex pipeline stages.

## 📢 Disclaimer
This project is for **practice and learning purposes only**. It may lack the security and optimizations required for production environments.

Happy learning! 🚀

---

Let me know if you’d like me to refine anything else or add more sections as you expand your library! ✌️
