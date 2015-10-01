# How to deploy a new release to Restlet's Nexus

- Run `mvn versions:set -DgenerateBackupPoms=false`.
- When prompted for the version, enter `<version-of-swagger-core>.<release-number>-restlet`. For example, if your branch is based on swagger-core 1.5.3 and it's the second Restlet release, then the version is `1.5.3.1-restlet`.
- Commit the new POMs with the message `Release <version>`.
- Tag this new commit with `v<version>`. For example, `v1.5.3.1-restlet`.
- Run `mvn deploy`.
- Run `mvn deploy -Paxway` if you want to deploy the tag for Axway.
- Run `mvn versions:set` again.
- When prompted for the version, enter `<version-of-swagger-core>.<release+1>-restlet-SNAPSHOT`. For example, `1.5.3.2-restlet-SNAPSHOT`.
- Commit the new POMs with the message `Prepare next development version`.
