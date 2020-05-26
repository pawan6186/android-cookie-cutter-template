# Android Template

This template contains dependency and integration for allmost all commonly used 3rd party libs, initial project setup for MVVM architecture.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

## Usage
1. [Install Home Brew:](https://brew.sh)
    * Mac OS: `ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"`
2. [Install cookiecutter:](http://cookiecutter.readthedocs.io/en/latest/installation.html)
    * Mac OS: `brew install cookiecutter`
    * Debian/Ubuntu: `sudo apt-get install cookiecutter`
3. [Run cookiecutter against the template:](http://cookiecutter.readthedocs.io/en/latest/usage.html)
    * Against GitHub repo: `cookiecutter gh:wittgroup-inc/android-cookie-cutter-template`
    * Specify a branch: `cookiecutter git@github.com:wittgroup-inc/android-cookie-cutter-template.git --checkout {name_of_branch}`
    * Local copy: `cookiecutter {path/to/android_template_project}`

## Post Generation
There are a number things that you still need to take care of to get your newly generated project up and running:
1. Run Gradle Sync in Android Studio to make sure you can build the project.
2. Generate 3 keystores for your project:
    * Generate a keystore for the dev, qa and prod tracks
    * Make sure to add the actual keystore files to the repository
    * **DO NOT SAVE THE KEYSTORE CREDENTIALS TO THE REPO, USE 1PASSWORD!**
    * Utilize the same credentials for all 3 keystores to reduce complexity
    * Try to follow the convention of app name and build flavor for the alias:
        * For example: `myapp_dev`, `myapp_qa` and `myaap_prod`
    * Update the `app/build.gradle` file to reflect these keystore values
