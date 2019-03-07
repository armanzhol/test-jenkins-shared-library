#!/usr/bin/env groovy

def echo(String name = 'human') {
  echo "Hello, ${name}."
}

def build() {
  echo "Build"
}

def uploadToNexus() {
  echo "Upload to Nexus"
}

def zip() {
  echo "Zip"
}

def incVersionCommit() {
  echo "Increase version and commit"
}

def notifyMSTeams() {
  echo "Notify via MS Teams"
}

def notifyMail() {
  echo "Notify via mail"
}