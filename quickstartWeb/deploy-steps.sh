        echo Stopping Tomcat service...
        sudo service tomcat stop
        sudo rm -f ${tomcat_webapps}/${war_name}.war, ignoreError: true
        sudo rm -rf ${tomcat_webapps}/${war_name}, ignoreError: true

        echo Sending war file...
        put from: ${war_path}/${war_name}.war, into: /tmp/${war_name}.war
        sudo cp -f /tmp/${war_name}.war ${tomcat_webapps}/${war_name}.war, ignoreError: true
        remove /tmp/${war_name}.war

        echo Starting Tomcat service...
        sudo service tomcat start