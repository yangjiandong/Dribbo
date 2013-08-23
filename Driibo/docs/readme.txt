dribbo
======

2013.08.23
----------

    1. gradel add:

    def localMavenRepo = 'file://' + new File('D:/HOME/local/repo').absolutePath
    repositories {
    // Use local Maven repo location. We don't need this if we only want to install
    // an artifact, but we do need it if we want to use dependencies from the local
    // repository.
    mavenRepo url: localMavenRepo
    mavenCentral()
    }
        
2013.08.22
----------

    1. git flow
    git flow feature start update_ui
    git flow feature finish update_ui

    release
    git flow release start RELEASE
    git flow release publish RELEASE

    --END

