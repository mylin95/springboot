package com.lmy.springboot.modules.java;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lmy.springboot.modules.java.domain.Baseline;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class App {
	public static void main(String[] args) {
		String pwd = new BCryptPasswordEncoder().encode("nacos.123");
		System.out.println(pwd);
	}


	@Test
	public void test() {
	    String a = "[{\n" +
				"\t\t\"data\": \"<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
				"<root>\n" +
				"    <objects id=\"linux-obj-1022\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data>-rw-------;</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1023\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data>-rw-------;</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1020\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data>-rw-------;</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1021\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data>-rw-------;</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1001\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data>root:$1$9jb7Eueg$x5d/W.65SMGpdJ4M8O4Wu1:15903:0:99999:7:::\n" +
				"bin:*:15560:0:99999:7:::\n" +
				"daemon:*:15560:0:99999:7:::\n" +
				"adm:*:15560:0:99999:7:::\n" +
				"lp:*:15560:0:99999:7:::\n" +
				"sync:*:15560:0:99999:7:::\n" +
				"shutdown:*:15560:0:99999:7:::\n" +
				"halt:*:15560:0:99999:7:::\n" +
				"mail:*:15560:0:99999:7:::\n" +
				"news:*:15560:0:99999:7:::\n" +
				"uucp:*:15560:0:99999:7:::\n" +
				"operator:*:15560:0:99999:7:::\n" +
				"games:*:15560:0:99999:7:::\n" +
				"gopher:*:15560:0:99999:7:::\n" +
				"ftp:*:15560:0:99999:7:::\n" +
				"nobody:*:15560:0:99999:7:::\n" +
				"nscd:!!:15560:0:99999:7:::\n" +
				"vcsa:!!:15560:0:99999:7:::\n" +
				"pcap:!!:15560:0:99999:7:::\n" +
				"ntp:!!:15560:0:99999:7:::\n" +
				"dbus:!!:15560:0:99999:7:::\n" +
				"avahi:!!:15560:0:99999:7:::\n" +
				"rpc:!!:15560:0:99999:7:::\n" +
				"mailnull:!!:15560:0:99999:7:::\n" +
				"smmsp:!!:15560:0:99999:7:::\n" +
				"sshd:!!:15560:0:99999:7:::\n" +
				"rpcuser:!!:15560:0:99999:7:::\n" +
				"nfsnobody:!!:15560:0:99999:7:::\n" +
				"xfs:!!:15560:0:99999:7:::\n" +
				"haldaemon:!!:15560:0:99999:7:::\n" +
				"avahi-autoipd:!!:15560:0:99999:7:::\n" +
				"gdm:!!:15560:0:99999:7:::\n" +
				"sabayon:!!:15560:0:99999:7:::\n" +
				"mongo:$1$U7Dx.fnZ$Pr2KADtk./Tpd7xPC5Cjp1:15903:0:99999:7:::\n" +
				"gnapp:$1$OqLwx.Ov$fwNHxP1uj9tJrF9tPRL2o1:15903:0:99999:7:::\n" +
				"mysql:!!:15609::::::\n" +
				"xiaomiao:$1$wOeD/nn2$SLq0Pr1MHlM0VVYaVgqEH.:15871:0:99999:7:::\n" +
				"oracle:$1$ca9RWCWR$rHvpmVDIm5rDlgjzeO2zb/:16322:0:99999:7:::\n" +
				"apache:!!:16357::::::\n" +
				"postfix:!!:16357::::::\n" +
				"vuser:!!:16358:0:99999:7:::\n" +
				"squid:!!:16989:0:99999:7:::\n" +
				"nginx:!!:17129::::::\n" +
				"app:!!:17129:0:99999:7:::\n" +
				"zabbix:!!:17151:0:99999:7:::\n" +
				"named:!!:17255::::::\n" +
				"jenkins:!!:17290::::::\n" +
				"sa-agent:passwod:17368:0:99999:7:::\n" +
				"jacob:$1$vlKixVwb$c5oeXS3SvbaVgWs4c0kc51:17368:0:99999:7:::\n" +
				"tuxedo:!!:17553:0:99999:7:::\n" +
				"weak_test1:$1$i2uvHUP/$Nk67YnLP7VyXhmY0TRnxt1:17629:0:99999:7:::\n" +
				"weak_test2:$1$UBjT3nvi$RXKlsRsp15KLOHYTqljHQ1:17629:0:99999:7:::\n" +
				"yhddev:$1$LFPX.uhv$t2q.LtWQNAaoEBgLy.3HL.:17814:0:99999:7:::\n" +
				"</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1041\">\n" +
				"        <state>complete</state>\n" +
				"        <result>noexist</result>\n" +
				"        <data>/bin/sh: systemctl: command not found;</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1040\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data>root:x:0:0:root:/root:/bin/bash\n" +
				"bin:x:1:1:bin:/bin:/sbin/nologin\n" +
				"daemon:x:2:2:daemon:/sbin:/sbin/nologin\n" +
				"adm:x:3:4:adm:/var/adm:/sbin/nologin\n" +
				"lp:x:4:7:lp:/var/spool/lpd:/sbin/nologin\n" +
				"sync:x:5:0:sync:/sbin:/bin/sync\n" +
				"shutdown:x:6:0:shutdown:/sbin:/sbin/shutdown\n" +
				"halt:x:7:0:halt:/sbin:/sbin/halt\n" +
				"mail:x:8:12:mail:/var/spool/mail:/sbin/nologin\n" +
				"news:x:9:13:news:/etc/news:\n" +
				"uucp:x:10:14:uucp:/var/spool/uucp:/sbin/nologin\n" +
				"operator:x:11:0:operator:/root:/sbin/nologin\n" +
				"games:x:12:100:games:/usr/games:/sbin/nologin\n" +
				"gopher:x:13:30:gopher:/var/gopher:/sbin/nologin\n" +
				"ftp:x:14:50:FTP User:/var/ftp:/sbin/nologin\n" +
				"nobody:x:99:99:Nobody:/:/sbin/nologin\n" +
				"nscd:x:28:28:NSCD Daemon:/:/sbin/nologin\n" +
				"vcsa:x:69:69:virtual console memory owner:/dev:/sbin/nologin\n" +
				"pcap:x:77:77::/var/arpwatch:/sbin/nologin\n" +
				"ntp:x:38:38::/etc/ntp:/sbin/nologin\n" +
				"dbus:x:81:81:System message bus:/:/sbin/nologin\n" +
				"avahi:x:70:70:Avahi daemon:/:/sbin/nologin\n" +
				"rpc:x:32:32:Portmapper RPC user:/:/sbin/nologin\n" +
				"mailnull:x:47:47::/var/spool/mqueue:/sbin/nologin\n" +
				"smmsp:x:51:51::/var/spool/mqueue:/sbin/nologin\n" +
				"sshd:x:74:74:Privilege-separated SSH:/var/empty/sshd:/sbin/nologin\n" +
				"rpcuser:x:29:29:RPC Service User:/var/lib/nfs:/sbin/nologin\n" +
				"nfsnobody:x:65534:65534:Anonymous NFS User:/var/lib/nfs:/sbin/nologin\n" +
				"xfs:x:43:43:X Font Server:/etc/X11/fs:/sbin/nologin\n" +
				"haldaemon:x:68:68:HAL daemon:/:/sbin/nologin\n" +
				"avahi-autoipd:x:100:101:avahi-autoipd:/var/lib/avahi-autoipd:/sbin/nologin\n" +
				"gdm:x:42:42::/var/gdm:/sbin/nologin\n" +
				"sabayon:x:86:86:Sabayon user:/home/sabayon:/sbin/nologin\n" +
				"mongo:x:500:501:MongoDB user:/opt/mongo:/bin/bash\n" +
				"gnapp:x:501:500:gnapp user:/home/gnapp:/bin/bash\n" +
				"mysql:x:27:27:MySQL Server:/var/lib/mysql:/bin/bash\n" +
				"xiaomiao:x:502:500::/home/xiaomiao:/bin/bash\n" +
				"oracle:x:503:500::/home/oracle:/bin/bash\n" +
				"apache:x:48:48:Apache:/var/www:/sbin/nologin\n" +
				"postfix:x:89:89::/var/spool/postfix:/sbin/nologin\n" +
				"vuser:x:1000:1000::/home/domains:/bin/true\n" +
				"squid:x:1001:1002::/home/squid:/sbin/nologin\n" +
				"nginx:x:101:102:nginx user:/var/cache/nginx:/sbin/nologin\n" +
				"app:x:1002:1003::/home/app:/bin/bash\n" +
				"zabbix:x:1003:1004::/home/zabbix:/sbin/nologin\n" +
				"named:x:25:25:Named:/var/named:/sbin/nologin\n" +
				"jenkins:x:102:103:Jenkins Automation Server:/var/lib/jenkins:/bin/false\n" +
				"jacob:x:0:0::/home/jacob:/bin/bash\n" +
				"sa-agent:x:1004:0::/home/sa-agent:/bin/bash\n" +
				"tuxedo:x:1005:1006::/home/tuxedo:/bin/bash\n" +
				"weak_test1:x:1006:1007::/home/weak_test1:/bin/bash\n" +
				"weak_test2:x:1007:1008::/home/weak_test2:/bin/bash\n" +
				"yhddev:x:1008:1009::/home/yhddev:/bin/bash\n" +
				"</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1005\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data># *REQUIRED*\n" +
				"#   Directory where mailboxes reside, _or_ name of file, relative to the\n" +
				"#   home directory.  If you _do_ define both, MAIL_DIR takes precedence.\n" +
				"#   QMAIL_DIR is for Qmail\n" +
				"#\n" +
				"#QMAIL_DIR\tMaildir\n" +
				"MAIL_DIR\t/var/spool/mail\n" +
				"#MAIL_FILE\t.mail\n" +
				"\n" +
				"# Password aging controls:\n" +
				"#\n" +
				"#\tPASS_MAX_DAYS\tMaximum number of days a password may be used.\n" +
				"#\tPASS_MIN_DAYS\tMinimum number of days allowed between password changes.\n" +
				"#\tPASS_MIN_LEN\tMinimum acceptable password length.\n" +
				"#\tPASS_WARN_AGE\tNumber of days warning given before a password expires.\n" +
				"#\n" +
				"PASS_MAX_DAYS\t99999\n" +
				"PASS_MIN_DAYS\t0\n" +
				"PASS_MIN_LEN\t5\n" +
				"PASS_WARN_AGE\t7\n" +
				"\n" +
				"#\n" +
				"# Min/max values for automatic uid selection in useradd\n" +
				"#\n" +
				"UID_MIN\t\t\t  500\n" +
				"UID_MAX\t\t\t60000\n" +
				"\n" +
				"#\n" +
				"# Min/max values for automatic gid selection in groupadd\n" +
				"#\n" +
				"GID_MIN\t\t\t  500\n" +
				"GID_MAX\t\t\t60000\n" +
				"\n" +
				"#\n" +
				"# If defined, this command is run when removing a user.\n" +
				"# It should remove any at/cron/print jobs etc. owned by\n" +
				"# the user to be removed (passed as the first argument).\n" +
				"#\n" +
				"#USERDEL_CMD\t/usr/sbin/userdel_local\n" +
				"\n" +
				"#\n" +
				"# If useradd should create home directories for users by default\n" +
				"# On RH systems, we do. This option is overridden with the -m flag on\n" +
				"# useradd command line.\n" +
				"#\n" +
				"CREATE_HOME\tyes\n" +
				"\n" +
				"# The permission mask is initialized to this value. If not specified, \n" +
				"# the permission mask will be initialized to 022.\n" +
				"UMASK           077\n" +
				"#umask 027\n" +
				"#UMASK 027\n" +
				"# This enables userdel to remove user groups if no members exist.\n" +
				"#\n" +
				"USERGROUPS_ENAB yes\n" +
				"\n" +
				"# Use MD5 or DES to encrypt password? Red Hat use MD5 by default.\n" +
				"MD5_CRYPT_ENAB yes\n" +
				"\n" +
				"ENCRYPT_METHOD MD5\n" +
				"\n" +
				"</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1004\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data>#%PAM-1.0\n" +
				"# This file is auto-generated.\n" +
				"# User changes will be destroyed the next time authconfig is run.\n" +
				"auth        required      pam_env.so\n" +
				"auth        sufficient    pam_unix.so nullok try_first_pass\n" +
				"auth        requisite     pam_succeed_if.so uid &gt;= 500 quiet\n" +
				"auth        required      pam_deny.so\n" +
				"\n" +
				"account     required      pam_unix.so\n" +
				"account     sufficient    pam_succeed_if.so uid &lt; 500 quiet\n" +
				"account     required      pam_permit.so\n" +
				"\n" +
				"password    requisite     pam_cracklib.so try_first_pass retry=3 \n" +
				"password    sufficient    pam_unix.so md5 shadow nullok try_first_pass use_authtok\n" +
				"password    required      pam_deny.so\n" +
				"\n" +
				"session     optional      pam_keyinit.so revoke\n" +
				"session     required      pam_limits.so\n" +
				"session     [success=1 default=ignore] pam_succeed_if.so service in crond quiet use_uid\n" +
				"session     required      pam_unix.so\n" +
				"</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1029\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data># /etc/profile\n" +
				"\n" +
				"# System wide environment and startup programs, for login setup\n" +
				"# Functions and aliases go in /etc/bashrc\n" +
				"\n" +
				"pathmunge () {\n" +
				"\tif ! echo $PATH | /bin/egrep -q \"(^|:)$1($|:)\" ; then\n" +
				"\t   if [ \"$2\" = \"after\" ] ; then\n" +
				"\t      PATH=$PATH:$1\n" +
				"\t   else\n" +
				"\t      PATH=$1:$PATH\n" +
				"\t   fi\n" +
				"\tfi\n" +
				"}\n" +
				"\n" +
				"# ksh workaround\n" +
				"if [ -z \"$EUID\" -a -x /usr/bin/id ]; then \n" +
				"\tEUID=`id -u`\n" +
				"\tUID=`id -ru`\n" +
				"fi\n" +
				"\n" +
				"# Path manipulation\n" +
				"if [ \"$EUID\" = \"0\" ]; then\n" +
				"\tpathmunge /sbin\n" +
				"\tpathmunge /usr/sbin\n" +
				"\tpathmunge /usr/local/sbin\n" +
				"fi\n" +
				"\n" +
				"# No core files by default\n" +
				"ulimit -S -c 0 &gt; /dev/null 2&gt;&amp;1\n" +
				"\n" +
				"if [ -x /usr/bin/id ]; then\n" +
				"\tUSER=\"`id -un`\"\n" +
				"\tLOGNAME=$USER\n" +
				"\tMAIL=\"/var/spool/mail/$USER\"\n" +
				"fi\n" +
				"\n" +
				"HOSTNAME=`/bin/hostname`\n" +
				"HISTSIZE=1000\n" +
				"if [ -z \"$INPUTRC\" -a ! -f \"$HOME/.inputrc\" ]; then\n" +
				"    INPUTRC=/etc/inputrc\n" +
				"fi\n" +
				"\n" +
				"export PATH USER LOGNAME MAIL HOSTNAME HISTSIZE INPUTRC\n" +
				"\n" +
				"# By default, we want umask to get set. This sets it for login shell\n" +
				"# Current threshold for system reserved uid/gids is 200\n" +
				"# You could check uidgid reservation validity in\n" +
				"# /usr/share/doc/setup-*/uidgid file\n" +
				"if [ $UID -gt 99 ] &amp;&amp; [ \"`id -gn`\" = \"`id -un`\" ]; then\n" +
				"    umask 002\n" +
				"else\n" +
				"    umask 022\n" +
				"fi\n" +
				"\n" +
				"for i in /etc/profile.d/*.sh ; do\n" +
				"    if [ -r \"$i\" ]; then\n" +
				"        if [ \"${-#*i}\" != \"$-\" ]; then\n" +
				"            . $i\n" +
				"        else\n" +
				"            . $i &gt;/dev/null 2&gt;&amp;1\n" +
				"        fi\n" +
				"    fi\n" +
				"done\n" +
				"\n" +
				"\n" +
				"if [ $USER = \"oracle\" ]; then  \n" +
				"\n" +
				"if [ $SHELL = \"/bin/ksh\" ]; then  \n" +
				"\n" +
				"ulimit -p 16384  \n" +
				"\n" +
				"ulimit -n 65536  \n" +
				"\n" +
				"else  \n" +
				"\n" +
				"ulimit -u 16384 -n 65536  \n" +
				"\n" +
				"fi \n" +
				"\n" +
				"fi\n" +
				"unset i\n" +
				"unset pathmunge\n" +
				"#JAXB_HOME=/home/cc/sa/SCAP/jaxb-ri-2.2.7\n" +
				"JAXB_HOME=/home/cc/sa/SCAP/jaxws-ri\n" +
				"JAVA_HOME=/home/cc/jdk1.7.0_79\n" +
				"#JAVA_HOME=/home/cc/sa/SCAP/jdk1.6.0_45\n" +
				"ZOOKEEPER_HOME=/home/cc/zookeeper-3.4.8\n" +
				"MAVEN_HOME=/home/cc/apache-maven-3.3.9\n" +
				"SCALA_HOME=/home/cc/scala-2.11.8\n" +
				"MONGODB=/usr/local/mongodb\n" +
				"RUBY_HOME=/home/cc/ruby\n" +
				"RVM_HOME=/usr/local/rvm\n" +
				"export ORACLE_HOME=/home/cc/instantclient_12_2\n" +
				"export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:$ORACLE_HOME\n" +
				"LUA_PATH=/usr/local/openresty/luajit\n" +
				"PATH=$RVM_HOME/bin:$RUBY_HOME/bin:$ZOOKEEPER_HOME/bin:$JAVA_HOME/bin:$MAVEN_HOME/bin:$SCALA_HOME/bin:$MONGODB/bin:$PATH:$LUA_PATH/bin\n" +
				"CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar:$JAVA_HOME/lib:$JAVA_HOME/jre/lib/ext:$JAVA_HOME/jre/lib\n" +
				"export JAXB_HOME\n" +
				"export JAVA_HOME\n" +
				"export PATH\n" +
				"export CLASSPATH\n" +
				"TZ='Asia/Shanghai'\n" +
				"export TZ\n" +
				"DISPLAY=192.168.16.39:0.0\n" +
				"export DISPLAY\n" +
				"\n" +
				"\n" +
				"</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1003\">\n" +
				"        <state>complete</state>\n" +
				"        <result>noexist</result>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1028\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data>Linux yhd03 2.6.18-308.el5 #1 SMP Fri Jan 27 17:17:51 EST 2012 x86_64 x86_64 x86_64 GNU/Linux;</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1002\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data>#%PAM-1.0\n" +
				"auth\t\tsufficient\tpam_rootok.so\n" +
				"# Uncomment the following line to implicitly trust users in the \"wheel\" group.\n" +
				"#auth\t\tsufficient\tpam_wheel.so trust use_uid\n" +
				"# Uncomment the following line to require a user to be in the \"wheel\" group.\n" +
				"#auth\t\trequired\tpam_wheel.so use_uid\n" +
				"auth\t\tinclude\t\tsystem-auth\n" +
				"account\t\tsufficient\tpam_succeed_if.so uid = 0 use_uid quiet\n" +
				"account\t\tinclude\t\tsystem-auth\n" +
				"password\tinclude\t\tsystem-auth\n" +
				"session\t\tinclude\t\tsystem-auth\n" +
				"session\t\toptional\tpam_xauth.so\n" +
				"</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1009\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data># /etc/profile\n" +
				"\n" +
				"# System wide environment and startup programs, for login setup\n" +
				"# Functions and aliases go in /etc/bashrc\n" +
				"\n" +
				"pathmunge () {\n" +
				"\tif ! echo $PATH | /bin/egrep -q \"(^|:)$1($|:)\" ; then\n" +
				"\t   if [ \"$2\" = \"after\" ] ; then\n" +
				"\t      PATH=$PATH:$1\n" +
				"\t   else\n" +
				"\t      PATH=$1:$PATH\n" +
				"\t   fi\n" +
				"\tfi\n" +
				"}\n" +
				"\n" +
				"# ksh workaround\n" +
				"if [ -z \"$EUID\" -a -x /usr/bin/id ]; then \n" +
				"\tEUID=`id -u`\n" +
				"\tUID=`id -ru`\n" +
				"fi\n" +
				"\n" +
				"# Path manipulation\n" +
				"if [ \"$EUID\" = \"0\" ]; then\n" +
				"\tpathmunge /sbin\n" +
				"\tpathmunge /usr/sbin\n" +
				"\tpathmunge /usr/local/sbin\n" +
				"fi\n" +
				"\n" +
				"# No core files by default\n" +
				"ulimit -S -c 0 &gt; /dev/null 2&gt;&amp;1\n" +
				"\n" +
				"if [ -x /usr/bin/id ]; then\n" +
				"\tUSER=\"`id -un`\"\n" +
				"\tLOGNAME=$USER\n" +
				"\tMAIL=\"/var/spool/mail/$USER\"\n" +
				"fi\n" +
				"\n" +
				"HOSTNAME=`/bin/hostname`\n" +
				"HISTSIZE=1000\n" +
				"if [ -z \"$INPUTRC\" -a ! -f \"$HOME/.inputrc\" ]; then\n" +
				"    INPUTRC=/etc/inputrc\n" +
				"fi\n" +
				"\n" +
				"export PATH USER LOGNAME MAIL HOSTNAME HISTSIZE INPUTRC\n" +
				"\n" +
				"# By default, we want umask to get set. This sets it for login shell\n" +
				"# Current threshold for system reserved uid/gids is 200\n" +
				"# You could check uidgid reservation validity in\n" +
				"# /usr/share/doc/setup-*/uidgid file\n" +
				"if [ $UID -gt 99 ] &amp;&amp; [ \"`id -gn`\" = \"`id -un`\" ]; then\n" +
				"    umask 002\n" +
				"else\n" +
				"    umask 022\n" +
				"fi\n" +
				"\n" +
				"for i in /etc/profile.d/*.sh ; do\n" +
				"    if [ -r \"$i\" ]; then\n" +
				"        if [ \"${-#*i}\" != \"$-\" ]; then\n" +
				"            . $i\n" +
				"        else\n" +
				"            . $i &gt;/dev/null 2&gt;&amp;1\n" +
				"        fi\n" +
				"    fi\n" +
				"done\n" +
				"\n" +
				"\n" +
				"if [ $USER = \"oracle\" ]; then  \n" +
				"\n" +
				"if [ $SHELL = \"/bin/ksh\" ]; then  \n" +
				"\n" +
				"ulimit -p 16384  \n" +
				"\n" +
				"ulimit -n 65536  \n" +
				"\n" +
				"else  \n" +
				"\n" +
				"ulimit -u 16384 -n 65536  \n" +
				"\n" +
				"fi \n" +
				"\n" +
				"fi\n" +
				"unset i\n" +
				"unset pathmunge\n" +
				"#JAXB_HOME=/home/cc/sa/SCAP/jaxb-ri-2.2.7\n" +
				"JAXB_HOME=/home/cc/sa/SCAP/jaxws-ri\n" +
				"JAVA_HOME=/home/cc/jdk1.7.0_79\n" +
				"#JAVA_HOME=/home/cc/sa/SCAP/jdk1.6.0_45\n" +
				"ZOOKEEPER_HOME=/home/cc/zookeeper-3.4.8\n" +
				"MAVEN_HOME=/home/cc/apache-maven-3.3.9\n" +
				"SCALA_HOME=/home/cc/scala-2.11.8\n" +
				"MONGODB=/usr/local/mongodb\n" +
				"RUBY_HOME=/home/cc/ruby\n" +
				"RVM_HOME=/usr/local/rvm\n" +
				"export ORACLE_HOME=/home/cc/instantclient_12_2\n" +
				"export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:$ORACLE_HOME\n" +
				"LUA_PATH=/usr/local/openresty/luajit\n" +
				"PATH=$RVM_HOME/bin:$RUBY_HOME/bin:$ZOOKEEPER_HOME/bin:$JAVA_HOME/bin:$MAVEN_HOME/bin:$SCALA_HOME/bin:$MONGODB/bin:$PATH:$LUA_PATH/bin\n" +
				"CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar:$JAVA_HOME/lib:$JAVA_HOME/jre/lib/ext:$JAVA_HOME/jre/lib\n" +
				"export JAXB_HOME\n" +
				"export JAVA_HOME\n" +
				"export PATH\n" +
				"export CLASSPATH\n" +
				"TZ='Asia/Shanghai'\n" +
				"export TZ\n" +
				"DISPLAY=192.168.16.39:0.0\n" +
				"export DISPLAY\n" +
				"\n" +
				"\n" +
				"</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1008\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data>-rw-r--r--;</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1007\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data>----------;</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1024\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data>NetworkManager \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;acpid          \t0:off\t1:off\t2:on\t3:on\t4:on\t5:on\t6:off;anacron        \t0:off\t1:off\t2:on\t3:on\t4:on\t5:on\t6:off;atd            \t0:off\t1:off\t2:off\t3:on\t4:on\t5:on\t6:off;auditd         \t0:off\t1:off\t2:on\t3:on\t4:on\t5:on\t6:off;autofs         \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;avahi-daemon   \t0:off\t1:off\t2:off\t3:on\t4:on\t5:on\t6:off;avahi-dnsconfd \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;bluetooth      \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;capi           \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;conman         \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;courier-authlib\t0:off\t1:off\t2:on\t3:on\t4:on\t5:on\t6:off;cpuspeed       \t0:off\t1:on\t2:on\t3:on\t4:on\t5:on\t6:off;crond          \t0:off\t1:off\t2:on\t3:on\t4:on\t5:on\t6:off;cups           \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;dnsmasq        \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;dund           \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;firstboot      \t0:off\t1:off\t2:off\t3:on\t4:off\t5:on\t6:off;gpm            \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;haldaemon      \t0:off\t1:off\t2:off\t3:on\t4:on\t5:on\t6:off;hidd           \t0:off\t1:off\t2:on\t3:on\t4:on\t5:on\t6:off;hplip          \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;httpd          \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;ip6tables      \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;ipmi           \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;iptables       \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;irda           \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;irqbalance     \t0:off\t1:off\t2:on\t3:on\t4:on\t5:on\t6:off;iscsi          \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;iscsid         \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;isdn           \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;jenkins        \t0:off\t1:off\t2:off\t3:on\t4:off\t5:on\t6:off;kdump          \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;kudzu          \t0:off\t1:off\t2:off\t3:on\t4:on\t5:on\t6:off;lm_sensors     \t0:off\t1:off\t2:on\t3:on\t4:on\t5:on\t6:off;lvm2-monitor   \t0:off\t1:on\t2:on\t3:on\t4:on\t5:on\t6:off;mcstrans       \t0:off\t1:off\t2:on\t3:on\t4:on\t5:on\t6:off;mdmonitor      \t0:off\t1:off\t2:on\t3:on\t4:on\t5:on\t6:off;mdmpd          \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;messagebus     \t0:off\t1:off\t2:off\t3:on\t4:on\t5:on\t6:off;microcode_ctl  \t0:off\t1:off\t2:on\t3:on\t4:on\t5:on\t6:off;mongod         \t0:off\t1:off\t2:on\t3:on\t4:on\t5:on\t6:off;multipathd     \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;mysqld         \t0:off\t1:off\t2:off\t3:on\t4:off\t5:off\t6:off;named          \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;netconsole     \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;netfs          \t0:off\t1:off\t2:off\t3:on\t4:on\t5:on\t6:off;netplugd       \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;network        \t0:off\t1:off\t2:on\t3:on\t4:on\t5:on\t6:off;nfs            \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;nfslock        \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;nginx          \t0:off\t1:off\t2:on\t3:on\t4:on\t5:on\t6:off;nginx-debug    \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;nscd           \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;ntpd           \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;oscap-scan     \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;pand           \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;pcscd          \t0:off\t1:off\t2:on\t3:on\t4:on\t5:on\t6:off;portmap        \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;psacct         \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;rawdevices     \t0:off\t1:off\t2:off\t3:on\t4:on\t5:on\t6:off;rdisc          \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;readahead_early\t0:off\t1:off\t2:on\t3:on\t4:on\t5:on\t6:off;readahead_later\t0:off\t1:off\t2:off\t3:off\t4:off\t5:on\t6:off;restorecond    \t0:off\t1:off\t2:on\t3:on\t4:on\t5:on\t6:off;rhnsd          \t0:off\t1:off\t2:off\t3:on\t4:on\t5:on\t6:off;rhsmcertd      \t0:off\t1:off\t2:off\t3:on\t4:on\t5:on\t6:off;rpcgssd        \t0:off\t1:off\t2:off\t3:on\t4:on\t5:on\t6:off;rpcidmapd      \t0:off\t1:off\t2:off\t3:on\t4:on\t5:on\t6:off;rpcsvcgssd     \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;saslauthd      \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;sendmail       \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;setroubleshoot \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;smartd         \t0:off\t1:off\t2:on\t3:on\t4:on\t5:on\t6:off;smb            \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;snmpd          \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;snmptrapd      \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;sshd           \t0:off\t1:off\t2:on\t3:on\t4:on\t5:on\t6:off;syslog         \t0:off\t1:off\t2:on\t3:on\t4:on\t5:on\t6:off;vmware-tools   \t0:off\t1:off\t2:on\t3:on\t4:off\t5:on\t6:off;vncserver      \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;vsftpd         \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;wdaemon        \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;winbind        \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;wpa_supplicant \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;xfs            \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;xinetd         \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;ypbind         \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;yum-updatesd   \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;zabbix-agent   \t0:off\t1:off\t2:off\t3:off\t4:off\t5:off\t6:off;</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1006\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data>-rw-r--r--;</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1010\">\n" +
				"        <state>complete</state>\n" +
				"        <result>noexist</result>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1011\">\n" +
				"        <state>complete</state>\n" +
				"        <result>noexist</result>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1012\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data>#\t$OpenBSD: sshd_config,v 1.103 2018/04/09 20:41:22 tj Exp $\n" +
				"\n" +
				"# This is the sshd server system-wide configuration file.  See\n" +
				"# sshd_config(5) for more information.\n" +
				"\n" +
				"# This sshd was compiled with PATH=/usr/bin:/bin:/usr/sbin:/sbin:/usr/local/openssh-7.8p1/bin\n" +
				"\n" +
				"# The strategy used for options in the default sshd_config shipped with\n" +
				"# OpenSSH is to specify options with their default value where\n" +
				"# possible, but leave them commented.  Uncommented options override the\n" +
				"# default value.\n" +
				"\n" +
				"#Port 22\n" +
				"#AddressFamily any\n" +
				"#ListenAddress 0.0.0.0\n" +
				"#ListenAddress ::\n" +
				"\n" +
				"#HostKey /usr/local/openssh-7.8p1/etc/ssh_host_rsa_key\n" +
				"#HostKey /usr/local/openssh-7.8p1/etc/ssh_host_ecdsa_key\n" +
				"#HostKey /usr/local/openssh-7.8p1/etc/ssh_host_ed25519_key\n" +
				"\n" +
				"# Ciphers and keying\n" +
				"#RekeyLimit default none\n" +
				"\n" +
				"# Logging\n" +
				"#SyslogFacility AUTH\n" +
				"#LogLevel INFO\n" +
				"\n" +
				"# Authentication:\n" +
				"\n" +
				"#LoginGraceTime 2m\n" +
				"#PermitRootLogin prohibit-password\n" +
				"#StrictModes yes\n" +
				"#MaxAuthTries 6\n" +
				"#MaxSessions 10\n" +
				"\n" +
				"#PubkeyAuthentication yes\n" +
				"\n" +
				"# The default is to check both .ssh/authorized_keys and .ssh/authorized_keys2\n" +
				"# but this is overridden so installations will only check .ssh/authorized_keys\n" +
				"AuthorizedKeysFile\t.ssh/authorized_keys\n" +
				"\n" +
				"#AuthorizedPrincipalsFile none\n" +
				"\n" +
				"#AuthorizedKeysCommand none\n" +
				"#AuthorizedKeysCommandUser nobody\n" +
				"\n" +
				"# For this to work you will also need host keys in /usr/local/openssh-7.8p1/etc/ssh_known_hosts\n" +
				"#HostbasedAuthentication no\n" +
				"# Change to yes if you don't trust ~/.ssh/known_hosts for\n" +
				"# HostbasedAuthentication\n" +
				"#IgnoreUserKnownHosts no\n" +
				"# Don't read the user's ~/.rhosts and ~/.shosts files\n" +
				"#IgnoreRhosts yes\n" +
				"\n" +
				"# To disable tunneled clear text passwords, change to no here!\n" +
				"#PasswordAuthentication yes\n" +
				"#PermitEmptyPasswords no\n" +
				"\n" +
				"# Change to no to disable s/key passwords\n" +
				"#ChallengeResponseAuthentication yes\n" +
				"\n" +
				"# Kerberos options\n" +
				"#KerberosAuthentication no\n" +
				"#KerberosOrLocalPasswd yes\n" +
				"#KerberosTicketCleanup yes\n" +
				"#KerberosGetAFSToken no\n" +
				"\n" +
				"# GSSAPI options\n" +
				"#GSSAPIAuthentication no\n" +
				"#GSSAPICleanupCredentials yes\n" +
				"\n" +
				"# Set this to 'yes' to enable PAM authentication, account processing,\n" +
				"# and session processing. If this is enabled, PAM authentication will\n" +
				"# be allowed through the ChallengeResponseAuthentication and\n" +
				"# PasswordAuthentication.  Depending on your PAM configuration,\n" +
				"# PAM authentication via ChallengeResponseAuthentication may bypass\n" +
				"# the setting of \"PermitRootLogin without-password\".\n" +
				"# If you just want the PAM account and session checks to run without\n" +
				"# PAM authentication, then enable this but set PasswordAuthentication\n" +
				"# and ChallengeResponseAuthentication to 'no'.\n" +
				"#UsePAM no\n" +
				"\n" +
				"#AllowAgentForwarding yes\n" +
				"#AllowTcpForwarding yes\n" +
				"#GatewayPorts no\n" +
				"#X11Forwarding no\n" +
				"#X11DisplayOffset 10\n" +
				"#X11UseLocalhost yes\n" +
				"#PermitTTY yes\n" +
				"#PrintMotd yes\n" +
				"#PrintLastLog yes\n" +
				"#TCPKeepAlive yes\n" +
				"#PermitUserEnvironment no\n" +
				"#Compression delayed\n" +
				"#ClientAliveInterval 0\n" +
				"#ClientAliveCountMax 3\n" +
				"#UseDNS no\n" +
				"#PidFile /var/run/sshd.pid\n" +
				"#MaxStartups 10:30:100\n" +
				"#PermitTunnel no\n" +
				"#ChrootDirectory none\n" +
				"#VersionAddendum none\n" +
				"\n" +
				"# no default banner path\n" +
				"#Banner none\n" +
				"\n" +
				"# override default of no subsystems\n" +
				"Subsystem\tsftp\t/usr/local/openssh-7.8p1/libexec/sftp-server\n" +
				"\n" +
				"# Example of overriding settings on a per-user basis\n" +
				"#Match User anoncvs\n" +
				"#\tX11Forwarding no\n" +
				"#\tAllowTcpForwarding no\n" +
				"#\tPermitTTY no\n" +
				"#\tForceCommand cvs server\n" +
				"</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1030\">\n" +
				"        <state>complete</state>\n" +
				"        <result>noexist</result>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1032\">\n" +
				"        <state>complete</state>\n" +
				"        <result>noexist</result>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1031\">\n" +
				"        <state>complete</state>\n" +
				"        <result>noexist</result>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1034\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data># Users that are not allowed to login via ftp\n" +
				"root\n" +
				"bin\n" +
				"daemon\n" +
				"adm\n" +
				"lp\n" +
				"sync\n" +
				"shutdown\n" +
				"halt\n" +
				"mail\n" +
				"news\n" +
				"uucp\n" +
				"operator\n" +
				"games\n" +
				"nobody\n" +
				"</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1033\">\n" +
				"        <state>complete</state>\n" +
				"        <result>noexist</result>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1035\">\n" +
				"        <state>complete</state>\n" +
				"        <result>noexist</result>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1036\">\n" +
				"        <state>complete</state>\n" +
				"        <result>noexist</result>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1037\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data>#%PAM-1.0\n" +
				"session    optional     pam_keyinit.so    force revoke\n" +
				"auth       required\tpam_listfile.so item=user sense=deny file=/etc/vsftpd/ftpusers onerr=succeed\n" +
				"auth       required\tpam_shells.so\n" +
				"auth       include\tsystem-auth\n" +
				"account    include\tsystem-auth\n" +
				"session    include\tsystem-auth\n" +
				"session    required     pam_loginuid.so\n" +
				"</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1038\">\n" +
				"        <state>complete</state>\n" +
				"        <result>noexist</result>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1039\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data># Example config file /etc/vsftpd/vsftpd.conf\n" +
				"#\n" +
				"# The default compiled in settings are fairly paranoid. This sample file\n" +
				"# loosens things up a bit, to make the ftp daemon more usable.\n" +
				"# Please see vsftpd.conf.5 for all compiled in defaults.\n" +
				"#\n" +
				"# READ THIS: This example file is NOT an exhaustive list of vsftpd options.\n" +
				"# Please read the vsftpd.conf.5 manual page to get a full idea of vsftpd's\n" +
				"# capabilities.\n" +
				"#\n" +
				"# Allow anonymous FTP? (Beware - allowed by default if you comment this out).\n" +
				"anonymous_enable=YES\n" +
				"#\n" +
				"# Uncomment this to allow local users to log in.\n" +
				"local_enable=YES\n" +
				"#\n" +
				"# Uncomment this to enable any form of FTP write command.\n" +
				"write_enable=YES\n" +
				"#\n" +
				"# Default umask for local users is 077. You may wish to change this to 022,\n" +
				"# if your users expect that (022 is used by most other ftpd's)\n" +
				"local_umask=022\n" +
				"#\n" +
				"# Uncomment this to allow the anonymous FTP user to upload files. This only\n" +
				"# has an effect if the above global write enable is activated. Also, you will\n" +
				"# obviously need to create a directory writable by the FTP user.\n" +
				"#anon_upload_enable=YES\n" +
				"#\n" +
				"# Uncomment this if you want the anonymous FTP user to be able to create\n" +
				"# new directories.\n" +
				"#anon_mkdir_write_enable=YES\n" +
				"#\n" +
				"# Activate directory messages - messages given to remote users when they\n" +
				"# go into a certain directory.\n" +
				"dirmessage_enable=YES\n" +
				"#\n" +
				"# The target log file can be vsftpd_log_file or xferlog_file.\n" +
				"# This depends on setting xferlog_std_format parameter\n" +
				"xferlog_enable=YES\n" +
				"#\n" +
				"# Make sure PORT transfer connections originate from port 20 (ftp-data).\n" +
				"connect_from_port_20=YES\n" +
				"#\n" +
				"# If you want, you can arrange for uploaded anonymous files to be owned by\n" +
				"# a different user. Note! Using \"root\" for uploaded files is not\n" +
				"# recommended!\n" +
				"#chown_uploads=YES\n" +
				"#chown_username=whoever\n" +
				"#\n" +
				"# The name of log file when xferlog_enable=YES and xferlog_std_format=YES\n" +
				"# WARNING - changing this filename affects /etc/logrotate.d/vsftpd.log\n" +
				"#xferlog_file=/var/log/xferlog\n" +
				"#\n" +
				"# Switches between logging into vsftpd_log_file and xferlog_file files.\n" +
				"# NO writes to vsftpd_log_file, YES to xferlog_file\n" +
				"xferlog_std_format=YES\n" +
				"#\n" +
				"# You may change the default value for timing out an idle session.\n" +
				"#idle_session_timeout=600\n" +
				"#\n" +
				"# You may change the default value for timing out a data connection.\n" +
				"#data_connection_timeout=120\n" +
				"#\n" +
				"# It is recommended that you define on your system a unique user which the\n" +
				"# ftp server can use as a totally isolated and unprivileged user.\n" +
				"#nopriv_user=ftpsecure\n" +
				"#\n" +
				"# Enable this and the server will recognise asynchronous ABOR requests. Not\n" +
				"# recommended for security (the code is non-trivial). Not enabling it,\n" +
				"# however, may confuse older FTP clients.\n" +
				"#async_abor_enable=YES\n" +
				"#\n" +
				"# By default the server will pretend to allow ASCII mode but in fact ignore\n" +
				"# the request. Turn on the below options to have the server actually do ASCII\n" +
				"# mangling on files when in ASCII mode.\n" +
				"# Beware that on some FTP servers, ASCII support allows a denial of service\n" +
				"# attack (DoS) via the command \"SIZE /big/file\" in ASCII mode. vsftpd\n" +
				"# predicted this attack and has always been safe, reporting the size of the\n" +
				"# raw file.\n" +
				"# ASCII mangling is a horrible feature of the protocol.\n" +
				"#ascii_upload_enable=YES\n" +
				"#ascii_download_enable=YES\n" +
				"#\n" +
				"# You may fully customise the login banner string:\n" +
				"#ftpd_banner=Welcome to blah FTP service.\n" +
				"#\n" +
				"# You may specify a file of disallowed anonymous e-mail addresses. Apparently\n" +
				"# useful for combatting certain DoS attacks.\n" +
				"#deny_email_enable=YES\n" +
				"# (default follows)\n" +
				"#banned_email_file=/etc/vsftpd/banned_emails\n" +
				"#\n" +
				"# You may specify an explicit list of local users to chroot() to their home\n" +
				"# directory. If chroot_local_user is YES, then this list becomes a list of\n" +
				"# users to NOT chroot().\n" +
				"#chroot_list_enable=YES\n" +
				"# (default follows)\n" +
				"#chroot_list_file=/etc/vsftpd/chroot_list\n" +
				"#\n" +
				"# You may activate the \"-R\" option to the builtin ls. This is disabled by\n" +
				"# default to avoid remote users being able to cause excessive I/O on large\n" +
				"# sites. However, some broken FTP clients such as \"ncftp\" and \"mirror\" assume\n" +
				"# the presence of the \"-R\" option, so there is a strong case for enabling it.\n" +
				"#ls_recurse_enable=YES\n" +
				"#\n" +
				"# When \"listen\" directive is enabled, vsftpd runs in standalone mode and \n" +
				"# listens on IPv4 sockets. This directive cannot be used in conjunction \n" +
				"# with the listen_ipv6 directive.\n" +
				"listen=YES\n" +
				"#\n" +
				"# This directive enables listening on IPv6 sockets. To listen on IPv4 and IPv6\n" +
				"# sockets, you must run two copies of vsftpd whith two configuration files.\n" +
				"# Make sure, that one of the listen options is commented !!\n" +
				"#listen_ipv6=YES\n" +
				"\n" +
				"pam_service_name=vsftpd\n" +
				"userlist_enable=YES\n" +
				"tcp_wrappers=YES\n" +
				"</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1018\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data>-rw-------;</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1017\">\n" +
				"        <state>complete</state>\n" +
				"        <result>noexist</result>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1019\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data>-rw-------;</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1014\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data>sshd           \t0:off\t1:off\t2:on\t3:on\t4:on\t5:on\t6:off;</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1013\">\n" +
				"        <state>complete</state>\n" +
				"        <result>noexist</result>\n" +
				"        <data></data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1016\">\n" +
				"        <state>complete</state>\n" +
				"        <result>exist</result>\n" +
				"        <data># Log all kernel messages to the console.\n" +
				"# Logging much else clutters up the screen.\n" +
				"#kern.*\t\t\t\t\t\t\t/dev/console\n" +
				"\n" +
				"# Log anything (except mail) of level info or higher.\n" +
				"# Don't log private authentication messages!\n" +
				"*.info;mail.none;authpriv.none;cron.none\t\t/var/log/messages\n" +
				"\n" +
				"# The authpriv file has restricted access.\n" +
				"authpriv.*\t\t\t\t\t\t/var/log/secure\n" +
				"\n" +
				"# Log all the mail messages in one place.\n" +
				"mail.*\t\t\t\t\t\t\t-/var/log/maillog\n" +
				"\n" +
				"\n" +
				"# Log cron stuff\n" +
				"cron.*\t\t\t\t\t\t\t/var/log/cron\n" +
				"\n" +
				"# Everybody gets emergency messages\n" +
				"*.emerg\t\t\t\t\t\t\t*\n" +
				"\n" +
				"# Save news errors of level crit and higher in a special file.\n" +
				"uucp,news.crit\t\t\t\t\t\t/var/log/spooler\n" +
				"\n" +
				"# Save boot messages also to boot.log\n" +
				"local7.*\t\t\t\t\t\t/var/log/boot.log\n" +
				"</data>\n" +
				"    </objects>\n" +
				"    <objects id=\"linux-obj-1015\">\n" +
				"        <state>complete</state>\n" +
				"        <result>noexist</result>\n" +
				"        <data>/bin/sh: systemctl: command not found;</data>\n" +
				"    </objects>\n" +
				"</root>\n" +
				"\",\"name\": \"jt-os-linux.xml\",\"time\": 1543387825162,\"type\": \"os\",\"uid\": \"linux\"}]";
		System.out.println(a);
	}

	@Test
	public void test2() {

		String string = "[{\r\n\t\t" +
                "  \"data\": \"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\" ?>\\n<root>\\n    <objects id=\\\"linux-obj-1022\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>-rw-------;</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1023\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>-rw-------;</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1020\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>-rw-------;</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1021\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>-rw-------;</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1001\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>root:$1$9jb7Eueg$x5d/W.65SMGpdJ4M8O4Wu1:15903:0:99999:7:::\\nbin:*:15560:0:99999:7:::\\ndaemon:*:15560:0:99999:7:::\\nadm:*:15560:0:99999:7:::\\nlp:*:15560:0:99999:7:::\\nsync:*:15560:0:99999:7:::\\nshutdown:*:15560:0:99999:7:::\\nhalt:*:15560:0:99999:7:::\\nmail:*:15560:0:99999:7:::\\nnews:*:15560:0:99999:7:::\\nuucp:*:15560:0:99999:7:::\\noperator:*:15560:0:99999:7:::\\ngames:*:15560:0:99999:7:::\\ngopher:*:15560:0:99999:7:::\\nftp:*:15560:0:99999:7:::\\nnobody:*:15560:0:99999:7:::\\nnscd:!!:15560:0:99999:7:::\\nvcsa:!!:15560:0:99999:7:::\\npcap:!!:15560:0:99999:7:::\\nntp:!!:15560:0:99999:7:::\\ndbus:!!:15560:0:99999:7:::\\navahi:!!:15560:0:99999:7:::\\nrpc:!!:15560:0:99999:7:::\\nmailnull:!!:15560:0:99999:7:::\\nsmmsp:!!:15560:0:99999:7:::\\nsshd:!!:15560:0:99999:7:::\\nrpcuser:!!:15560:0:99999:7:::\\nnfsnobody:!!:15560:0:99999:7:::\\nxfs:!!:15560:0:99999:7:::\\nhaldaemon:!!:15560:0:99999:7:::\\navahi-autoipd:!!:15560:0:99999:7:::\\ngdm:!!:15560:0:99999:7:::\\nsabayon:!!:15560:0:99999:7:::\\nmongo:$1$U7Dx.fnZ$Pr2KADtk./Tpd7xPC5Cjp1:15903:0:99999:7:::\\ngnapp:$1$OqLwx.Ov$fwNHxP1uj9tJrF9tPRL2o1:15903:0:99999:7:::\\nmysql:!!:15609::::::\\nxiaomiao:$1$wOeD/nn2$SLq0Pr1MHlM0VVYaVgqEH.:15871:0:99999:7:::\\noracle:$1$ca9RWCWR$rHvpmVDIm5rDlgjzeO2zb/:16322:0:99999:7:::\\napache:!!:16357::::::\\npostfix:!!:16357::::::\\nvuser:!!:16358:0:99999:7:::\\nsquid:!!:16989:0:99999:7:::\\nnginx:!!:17129::::::\\napp:!!:17129:0:99999:7:::\\nzabbix:!!:17151:0:99999:7:::\\nnamed:!!:17255::::::\\njenkins:!!:17290::::::\\nsa-agent:passwod:17368:0:99999:7:::\\njacob:$1$vlKixVwb$c5oeXS3SvbaVgWs4c0kc51:17368:0:99999:7:::\\ntuxedo:!!:17553:0:99999:7:::\\nweak_test1:$1$i2uvHUP/$Nk67YnLP7VyXhmY0TRnxt1:17629:0:99999:7:::\\nweak_test2:$1$UBjT3nvi$RXKlsRsp15KLOHYTqljHQ1:17629:0:99999:7:::\\nyhddev:$1$LFPX.uhv$t2q.LtWQNAaoEBgLy.3HL.:17814:0:99999:7:::\\n</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1041\\\">\\n        <state>complete</state>\\n        <result>noexist</result>\\n        <data>/bin/sh: systemctl: command not found;</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1040\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>root:x:0:0:root:/root:/bin/bash\\nbin:x:1:1:bin:/bin:/sbin/nologin\\ndaemon:x:2:2:daemon:/sbin:/sbin/nologin\\nadm:x:3:4:adm:/var/adm:/sbin/nologin\\nlp:x:4:7:lp:/var/spool/lpd:/sbin/nologin\\nsync:x:5:0:sync:/sbin:/bin/sync\\nshutdown:x:6:0:shutdown:/sbin:/sbin/shutdown\\nhalt:x:7:0:halt:/sbin:/sbin/halt\\nmail:x:8:12:mail:/var/spool/mail:/sbin/nologin\\nnews:x:9:13:news:/etc/news:\\nuucp:x:10:14:uucp:/var/spool/uucp:/sbin/nologin\\noperator:x:11:0:operator:/root:/sbin/nologin\\ngames:x:12:100:games:/usr/games:/sbin/nologin\\ngopher:x:13:30:gopher:/var/gopher:/sbin/nologin\\nftp:x:14:50:FTP User:/var/ftp:/sbin/nologin\\nnobody:x:99:99:Nobody:/:/sbin/nologin\\nnscd:x:28:28:NSCD Daemon:/:/sbin/nologin\\nvcsa:x:69:69:virtual console memory owner:/dev:/sbin/nologin\\npcap:x:77:77::/var/arpwatch:/sbin/nologin\\nntp:x:38:38::/etc/ntp:/sbin/nologin\\ndbus:x:81:81:System message bus:/:/sbin/nologin\\navahi:x:70:70:Avahi daemon:/:/sbin/nologin\\nrpc:x:32:32:Portmapper RPC user:/:/sbin/nologin\\nmailnull:x:47:47::/var/spool/mqueue:/sbin/nologin\\nsmmsp:x:51:51::/var/spool/mqueue:/sbin/nologin\\nsshd:x:74:74:Privilege-separated SSH:/var/empty/sshd:/sbin/nologin\\nrpcuser:x:29:29:RPC Service User:/var/lib/nfs:/sbin/nologin\\nnfsnobody:x:65534:65534:Anonymous NFS User:/var/lib/nfs:/sbin/nologin\\nxfs:x:43:43:X Font Server:/etc/X11/fs:/sbin/nologin\\nhaldaemon:x:68:68:HAL daemon:/:/sbin/nologin\\navahi-autoipd:x:100:101:avahi-autoipd:/var/lib/avahi-autoipd:/sbin/nologin\\ngdm:x:42:42::/var/gdm:/sbin/nologin\\nsabayon:x:86:86:Sabayon user:/home/sabayon:/sbin/nologin\\nmongo:x:500:501:MongoDB user:/opt/mongo:/bin/bash\\ngnapp:x:501:500:gnapp user:/home/gnapp:/bin/bash\\nmysql:x:27:27:MySQL Server:/var/lib/mysql:/bin/bash\\nxiaomiao:x:502:500::/home/xiaomiao:/bin/bash\\noracle:x:503:500::/home/oracle:/bin/bash\\napache:x:48:48:Apache:/var/www:/sbin/nologin\\npostfix:x:89:89::/var/spool/postfix:/sbin/nologin\\nvuser:x:1000:1000::/home/domains:/bin/true\\nsquid:x:1001:1002::/home/squid:/sbin/nologin\\nnginx:x:101:102:nginx user:/var/cache/nginx:/sbin/nologin\\napp:x:1002:1003::/home/app:/bin/bash\\nzabbix:x:1003:1004::/home/zabbix:/sbin/nologin\\nnamed:x:25:25:Named:/var/named:/sbin/nologin\\njenkins:x:102:103:Jenkins Automation Server:/var/lib/jenkins:/bin/false\\njacob:x:0:0::/home/jacob:/bin/bash\\nsa-agent:x:1004:0::/home/sa-agent:/bin/bash\\ntuxedo:x:1005:1006::/home/tuxedo:/bin/bash\\nweak_test1:x:1006:1007::/home/weak_test1:/bin/bash\\nweak_test2:x:1007:1008::/home/weak_test2:/bin/bash\\nyhddev:x:1008:1009::/home/yhddev:/bin/bash\\n</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1005\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data># *REQUIRED*\\n#   Directory where mailboxes reside, _or_ name of file, relative to the\\n#   home directory.  If you _do_ define both, MAIL_DIR takes precedence.\\n#   QMAIL_DIR is for Qmail\\n#\\n#QMAIL_DIR\\tMaildir\\nMAIL_DIR\\t/var/spool/mail\\n#MAIL_FILE\\t.mail\\n\\n# Password aging controls:\\n#\\n#\\tPASS_MAX_DAYS\\tMaximum number of days a password may be used.\\n#\\tPASS_MIN_DAYS\\tMinimum number of days allowed between password changes.\\n#\\tPASS_MIN_LEN\\tMinimum acceptable password length.\\n#\\tPASS_WARN_AGE\\tNumber of days warning given before a password expires.\\n#\\nPASS_MAX_DAYS\\t99999\\nPASS_MIN_DAYS\\t0\\nPASS_MIN_LEN\\t5\\nPASS_WARN_AGE\\t7\\n\\n#\\n# Min/max values for automatic uid selection in useradd\\n#\\nUID_MIN\\t\\t\\t  500\\nUID_MAX\\t\\t\\t60000\\n\\n#\\n# Min/max values for automatic gid selection in groupadd\\n#\\nGID_MIN\\t\\t\\t  500\\nGID_MAX\\t\\t\\t60000\\n\\n#\\n# If defined, this command is run when removing a user.\\n# It should remove any at/cron/print jobs etc. owned by\\n# the user to be removed (passed as the first argument).\\n#\\n#USERDEL_CMD\\t/usr/sbin/userdel_local\\n\\n#\\n# If useradd should create home directories for users by default\\n# On RH systems, we do. This option is overridden with the -m flag on\\n# useradd command line.\\n#\\nCREATE_HOME\\tyes\\n\\n# The permission mask is initialized to this value. If not specified, \\n# the permission mask will be initialized to 022.\\nUMASK           077\\n#umask 027\\n#UMASK 027\\n# This enables userdel to remove user groups if no members exist.\\n#\\nUSERGROUPS_ENAB yes\\n\\n# Use MD5 or DES to encrypt password? Red Hat use MD5 by default.\\nMD5_CRYPT_ENAB yes\\n\\nENCRYPT_METHOD MD5\\n\\n</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1004\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>#%PAM-1.0\\n# This file is auto-generated.\\n# User changes will be destroyed the next time authconfig is run.\\nauth        required      pam_env.so\\nauth        sufficient    pam_unix.so nullok try_first_pass\\nauth        requisite     pam_succeed_if.so uid &gt;= 500 quiet\\nauth        required      pam_deny.so\\n\\naccount     required      pam_unix.so\\naccount     sufficient    pam_succeed_if.so uid &lt; 500 quiet\\naccount     required      pam_permit.so\\n\\npassword    requisite     pam_cracklib.so try_first_pass retry=3 \\npassword    sufficient    pam_unix.so md5 shadow nullok try_first_pass use_authtok\\npassword    required      pam_deny.so\\n\\nsession     optional      pam_keyinit.so revoke\\nsession     required      pam_limits.so\\nsession     [success=1 default=ignore] pam_succeed_if.so service in crond quiet use_uid\\nsession     required      pam_unix.so\\n</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1029\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data># /etc/profile\\n\\n# System wide environment and startup programs, for login setup\\n# Functions and aliases go in /etc/bashrc\\n\\npathmunge () {\\n\\tif ! echo $PATH | /bin/egrep -q \\\"(^|:)$1($|:)\\\" ; then\\n\\t   if [ \\\"$2\\\" = \\\"after\\\" ] ; then\\n\\t      PATH=$PATH:$1\\n\\t   else\\n\\t      PATH=$1:$PATH\\n\\t   fi\\n\\tfi\\n}\\n\\n# ksh workaround\\nif [ -z \\\"$EUID\\\" -a -x /usr/bin/id ]; then \\n\\tEUID=`id -u`\\n\\tUID=`id -ru`\\nfi\\n\\n# Path manipulation\\nif [ \\\"$EUID\\\" = \\\"0\\\" ]; then\\n\\tpathmunge /sbin\\n\\tpathmunge /usr/sbin\\n\\tpathmunge /usr/local/sbin\\nfi\\n\\n# No core files by default\\nulimit -S -c 0 &gt; /dev/null 2&gt;&amp;1\\n\\nif [ -x /usr/bin/id ]; then\\n\\tUSER=\\\"`id -un`\\\"\\n\\tLOGNAME=$USER\\n\\tMAIL=\\\"/var/spool/mail/$USER\\\"\\nfi\\n\\nHOSTNAME=`/bin/hostname`\\nHISTSIZE=1000\\nif [ -z \\\"$INPUTRC\\\" -a ! -f \\\"$HOME/.inputrc\\\" ]; then\\n    INPUTRC=/etc/inputrc\\nfi\\n\\nexport PATH USER LOGNAME MAIL HOSTNAME HISTSIZE INPUTRC\\n\\n# By default, we want umask to get set. This sets it for login shell\\n# Current threshold for system reserved uid/gids is 200\\n# You could check uidgid reservation validity in\\n# /usr/share/doc/setup-*/uidgid file\\nif [ $UID -gt 99 ] &amp;&amp; [ \\\"`id -gn`\\\" = \\\"`id -un`\\\" ]; then\\n    umask 002\\nelse\\n    umask 022\\nfi\\n\\nfor i in /etc/profile.d/*.sh ; do\\n    if [ -r \\\"$i\\\" ]; then\\n        if [ \\\"${-#*i}\\\" != \\\"$-\\\" ]; then\\n            . $i\\n        else\\n            . $i &gt;/dev/null 2&gt;&amp;1\\n        fi\\n    fi\\ndone\\n\\n\\nif [ $USER = \\\"oracle\\\" ]; then  \\n\\nif [ $SHELL = \\\"/bin/ksh\\\" ]; then  \\n\\nulimit -p 16384  \\n\\nulimit -n 65536  \\n\\nelse  \\n\\nulimit -u 16384 -n 65536  \\n\\nfi \\n\\nfi\\nunset i\\nunset pathmunge\\n#JAXB_HOME=/home/cc/sa/SCAP/jaxb-ri-2.2.7\\nJAXB_HOME=/home/cc/sa/SCAP/jaxws-ri\\nJAVA_HOME=/home/cc/jdk1.7.0_79\\n#JAVA_HOME=/home/cc/sa/SCAP/jdk1.6.0_45\\nZOOKEEPER_HOME=/home/cc/zookeeper-3.4.8\\nMAVEN_HOME=/home/cc/apache-maven-3.3.9\\nSCALA_HOME=/home/cc/scala-2.11.8\\nMONGODB=/usr/local/mongodb\\nRUBY_HOME=/home/cc/ruby\\nRVM_HOME=/usr/local/rvm\\nexport ORACLE_HOME=/home/cc/instantclient_12_2\\nexport LD_LIBRARY_PATH=$LD_LIBRARY_PATH:$ORACLE_HOME\\nLUA_PATH=/usr/local/openresty/luajit\\nPATH=$RVM_HOME/bin:$RUBY_HOME/bin:$ZOOKEEPER_HOME/bin:$JAVA_HOME/bin:$MAVEN_HOME/bin:$SCALA_HOME/bin:$MONGODB/bin:$PATH:$LUA_PATH/bin\\nCLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar:$JAVA_HOME/lib:$JAVA_HOME/jre/lib/ext:$JAVA_HOME/jre/lib\\nexport JAXB_HOME\\nexport JAVA_HOME\\nexport PATH\\nexport CLASSPATH\\nTZ='Asia/Shanghai'\\nexport TZ\\nDISPLAY=192.168.16.39:0.0\\nexport DISPLAY\\n\\n\\n</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1003\\\">\\n        <state>complete</state>\\n        <result>noexist</result>\\n    </objects>\\n    <objects id=\\\"linux-obj-1028\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>Linux yhd03 2.6.18-308.el5 #1 SMP Fri Jan 27 17:17:51 EST 2012 x86_64 x86_64 x86_64 GNU/Linux;</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1002\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>#%PAM-1.0\\nauth\\t\\tsufficient\\tpam_rootok.so\\n# Uncomment the following line to implicitly trust users in the \\\"wheel\\\" group.\\n#auth\\t\\tsufficient\\tpam_wheel.so trust use_uid\\n# Uncomment the following line to require a user to be in the \\\"wheel\\\" group.\\n#auth\\t\\trequired\\tpam_wheel.so use_uid\\nauth\\t\\tinclude\\t\\tsystem-auth\\naccount\\t\\tsufficient\\tpam_succeed_if.so uid = 0 use_uid quiet\\naccount\\t\\tinclude\\t\\tsystem-auth\\npassword\\tinclude\\t\\tsystem-auth\\nsession\\t\\tinclude\\t\\tsystem-auth\\nsession\\t\\toptional\\tpam_xauth.so\\n</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1009\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data># /etc/profile\\n\\n# System wide environment and startup programs, for login setup\\n# Functions and aliases go in /etc/bashrc\\n\\npathmunge () {\\n\\tif ! echo $PATH | /bin/egrep -q \\\"(^|:)$1($|:)\\\" ; then\\n\\t   if [ \\\"$2\\\" = \\\"after\\\" ] ; then\\n\\t      PATH=$PATH:$1\\n\\t   else\\n\\t      PATH=$1:$PATH\\n\\t   fi\\n\\tfi\\n}\\n\\n# ksh workaround\\nif [ -z \\\"$EUID\\\" -a -x /usr/bin/id ]; then \\n\\tEUID=`id -u`\\n\\tUID=`id -ru`\\nfi\\n\\n# Path manipulation\\nif [ \\\"$EUID\\\" = \\\"0\\\" ]; then\\n\\tpathmunge /sbin\\n\\tpathmunge /usr/sbin\\n\\tpathmunge /usr/local/sbin\\nfi\\n\\n# No core files by default\\nulimit -S -c 0 &gt; /dev/null 2&gt;&amp;1\\n\\nif [ -x /usr/bin/id ]; then\\n\\tUSER=\\\"`id -un`\\\"\\n\\tLOGNAME=$USER\\n\\tMAIL=\\\"/var/spool/mail/$USER\\\"\\nfi\\n\\nHOSTNAME=`/bin/hostname`\\nHISTSIZE=1000\\nif [ -z \\\"$INPUTRC\\\" -a ! -f \\\"$HOME/.inputrc\\\" ]; then\\n    INPUTRC=/etc/inputrc\\nfi\\n\\nexport PATH USER LOGNAME MAIL HOSTNAME HISTSIZE INPUTRC\\n\\n# By default, we want umask to get set. This sets it for login shell\\n# Current threshold for system reserved uid/gids is 200\\n# You could check uidgid reservation validity in\\n# /usr/share/doc/setup-*/uidgid file\\nif [ $UID -gt 99 ] &amp;&amp; [ \\\"`id -gn`\\\" = \\\"`id -un`\\\" ]; then\\n    umask 002\\nelse\\n    umask 022\\nfi\\n\\nfor i in /etc/profile.d/*.sh ; do\\n    if [ -r \\\"$i\\\" ]; then\\n        if [ \\\"${-#*i}\\\" != \\\"$-\\\" ]; then\\n            . $i\\n        else\\n            . $i &gt;/dev/null 2&gt;&amp;1\\n        fi\\n    fi\\ndone\\n\\n\\nif [ $USER = \\\"oracle\\\" ]; then  \\n\\nif [ $SHELL = \\\"/bin/ksh\\\" ]; then  \\n\\nulimit -p 16384  \\n\\nulimit -n 65536  \\n\\nelse  \\n\\nulimit -u 16384 -n 65536  \\n\\nfi \\n\\nfi\\nunset i\\nunset pathmunge\\n#JAXB_HOME=/home/cc/sa/SCAP/jaxb-ri-2.2.7\\nJAXB_HOME=/home/cc/sa/SCAP/jaxws-ri\\nJAVA_HOME=/home/cc/jdk1.7.0_79\\n#JAVA_HOME=/home/cc/sa/SCAP/jdk1.6.0_45\\nZOOKEEPER_HOME=/home/cc/zookeeper-3.4.8\\nMAVEN_HOME=/home/cc/apache-maven-3.3.9\\nSCALA_HOME=/home/cc/scala-2.11.8\\nMONGODB=/usr/local/mongodb\\nRUBY_HOME=/home/cc/ruby\\nRVM_HOME=/usr/local/rvm\\nexport ORACLE_HOME=/home/cc/instantclient_12_2\\nexport LD_LIBRARY_PATH=$LD_LIBRARY_PATH:$ORACLE_HOME\\nLUA_PATH=/usr/local/openresty/luajit\\nPATH=$RVM_HOME/bin:$RUBY_HOME/bin:$ZOOKEEPER_HOME/bin:$JAVA_HOME/bin:$MAVEN_HOME/bin:$SCALA_HOME/bin:$MONGODB/bin:$PATH:$LUA_PATH/bin\\nCLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar:$JAVA_HOME/lib:$JAVA_HOME/jre/lib/ext:$JAVA_HOME/jre/lib\\nexport JAXB_HOME\\nexport JAVA_HOME\\nexport PATH\\nexport CLASSPATH\\nTZ='Asia/Shanghai'\\nexport TZ\\nDISPLAY=192.168.16.39:0.0\\nexport DISPLAY\\n\\n\\n</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1008\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>-rw-r--r--;</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1007\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>----------;</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1024\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>NetworkManager \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;acpid          \\t0:off\\t1:off\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;anacron        \\t0:off\\t1:off\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;atd            \\t0:off\\t1:off\\t2:off\\t3:on\\t4:on\\t5:on\\t6:off;auditd         \\t0:off\\t1:off\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;autofs         \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;avahi-daemon   \\t0:off\\t1:off\\t2:off\\t3:on\\t4:on\\t5:on\\t6:off;avahi-dnsconfd \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;bluetooth      \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;capi           \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;conman         \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;courier-authlib\\t0:off\\t1:off\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;cpuspeed       \\t0:off\\t1:on\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;crond          \\t0:off\\t1:off\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;cups           \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;dnsmasq        \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;dund           \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;firstboot      \\t0:off\\t1:off\\t2:off\\t3:on\\t4:off\\t5:on\\t6:off;gpm            \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;haldaemon      \\t0:off\\t1:off\\t2:off\\t3:on\\t4:on\\t5:on\\t6:off;hidd           \\t0:off\\t1:off\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;hplip          \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;httpd          \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;ip6tables      \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;ipmi           \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;iptables       \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;irda           \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;irqbalance     \\t0:off\\t1:off\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;iscsi          \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;iscsid         \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;isdn           \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;jenkins        \\t0:off\\t1:off\\t2:off\\t3:on\\t4:off\\t5:on\\t6:off;kdump          \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;kudzu          \\t0:off\\t1:off\\t2:off\\t3:on\\t4:on\\t5:on\\t6:off;lm_sensors     \\t0:off\\t1:off\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;lvm2-monitor   \\t0:off\\t1:on\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;mcstrans       \\t0:off\\t1:off\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;mdmonitor      \\t0:off\\t1:off\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;mdmpd          \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;messagebus     \\t0:off\\t1:off\\t2:off\\t3:on\\t4:on\\t5:on\\t6:off;microcode_ctl  \\t0:off\\t1:off\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;mongod         \\t0:off\\t1:off\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;multipathd     \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;mysqld         \\t0:off\\t1:off\\t2:off\\t3:on\\t4:off\\t5:off\\t6:off;named          \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;netconsole     \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;netfs          \\t0:off\\t1:off\\t2:off\\t3:on\\t4:on\\t5:on\\t6:off;netplugd       \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;network        \\t0:off\\t1:off\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;nfs            \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;nfslock        \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;nginx          \\t0:off\\t1:off\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;nginx-debug    \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;nscd           \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;ntpd           \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;oscap-scan     \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;pand           \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;pcscd          \\t0:off\\t1:off\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;portmap        \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;psacct         \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;rawdevices     \\t0:off\\t1:off\\t2:off\\t3:on\\t4:on\\t5:on\\t6:off;rdisc          \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;readahead_early\\t0:off\\t1:off\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;readahead_later\\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:on\\t6:off;restorecond    \\t0:off\\t1:off\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;rhnsd          \\t0:off\\t1:off\\t2:off\\t3:on\\t4:on\\t5:on\\t6:off;rhsmcertd      \\t0:off\\t1:off\\t2:off\\t3:on\\t4:on\\t5:on\\t6:off;rpcgssd        \\t0:off\\t1:off\\t2:off\\t3:on\\t4:on\\t5:on\\t6:off;rpcidmapd      \\t0:off\\t1:off\\t2:off\\t3:on\\t4:on\\t5:on\\t6:off;rpcsvcgssd     \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;saslauthd      \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;sendmail       \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;setroubleshoot \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;smartd         \\t0:off\\t1:off\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;smb            \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;snmpd          \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;snmptrapd      \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;sshd           \\t0:off\\t1:off\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;syslog         \\t0:off\\t1:off\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;vmware-tools   \\t0:off\\t1:off\\t2:on\\t3:on\\t4:off\\t5:on\\t6:off;vncserver      \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;vsftpd         \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;wdaemon        \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;winbind        \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;wpa_supplicant \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;xfs            \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;xinetd         \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;ypbind         \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;yum-updatesd   \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;zabbix-agent   \\t0:off\\t1:off\\t2:off\\t3:off\\t4:off\\t5:off\\t6:off;</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1006\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>-rw-r--r--;</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1010\\\">\\n        <state>complete</state>\\n        <result>noexist</result>\\n    </objects>\\n    <objects id=\\\"linux-obj-1011\\\">\\n        <state>complete</state>\\n        <result>noexist</result>\\n    </objects>\\n    <objects id=\\\"linux-obj-1012\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>#\\t$OpenBSD: sshd_config,v 1.103 2018/04/09 20:41:22 tj Exp $\\n\\n# This is the sshd server system-wide configuration file.  See\\n# sshd_config(5) for more information.\\n\\n# This sshd was compiled with PATH=/usr/bin:/bin:/usr/sbin:/sbin:/usr/local/openssh-7.8p1/bin\\n\\n# The strategy used for options in the default sshd_config shipped with\\n# OpenSSH is to specify options with their default value where\\n# possible, but leave them commented.  Uncommented options override the\\n# default value.\\n\\n#Port 22\\n#AddressFamily any\\n#ListenAddress 0.0.0.0\\n#ListenAddress ::\\n\\n#HostKey /usr/local/openssh-7.8p1/etc/ssh_host_rsa_key\\n#HostKey /usr/local/openssh-7.8p1/etc/ssh_host_ecdsa_key\\n#HostKey /usr/local/openssh-7.8p1/etc/ssh_host_ed25519_key\\n\\n# Ciphers and keying\\n#RekeyLimit default none\\n\\n# Logging\\n#SyslogFacility AUTH\\n#LogLevel INFO\\n\\n# Authentication:\\n\\n#LoginGraceTime 2m\\n#PermitRootLogin prohibit-password\\n#StrictModes yes\\n#MaxAuthTries 6\\n#MaxSessions 10\\n\\n#PubkeyAuthentication yes\\n\\n# The default is to check both .ssh/authorized_keys and .ssh/authorized_keys2\\n# but this is overridden so installations will only check .ssh/authorized_keys\\nAuthorizedKeysFile\\t.ssh/authorized_keys\\n\\n#AuthorizedPrincipalsFile none\\n\\n#AuthorizedKeysCommand none\\n#AuthorizedKeysCommandUser nobody\\n\\n# For this to work you will also need host keys in /usr/local/openssh-7.8p1/etc/ssh_known_hosts\\n#HostbasedAuthentication no\\n# Change to yes if you don't trust ~/.ssh/known_hosts for\\n# HostbasedAuthentication\\n#IgnoreUserKnownHosts no\\n# Don't read the user's ~/.rhosts and ~/.shosts files\\n#IgnoreRhosts yes\\n\\n# To disable tunneled clear text passwords, change to no here!\\n#PasswordAuthentication yes\\n#PermitEmptyPasswords no\\n\\n# Change to no to disable s/key passwords\\n#ChallengeResponseAuthentication yes\\n\\n# Kerberos options\\n#KerberosAuthentication no\\n#KerberosOrLocalPasswd yes\\n#KerberosTicketCleanup yes\\n#KerberosGetAFSToken no\\n\\n# GSSAPI options\\n#GSSAPIAuthentication no\\n#GSSAPICleanupCredentials yes\\n\\n# Set this to 'yes' to enable PAM authentication, account processing,\\n# and session processing. If this is enabled, PAM authentication will\\n# be allowed through the ChallengeResponseAuthentication and\\n# PasswordAuthentication.  Depending on your PAM configuration,\\n# PAM authentication via ChallengeResponseAuthentication may bypass\\n# the setting of \\\"PermitRootLogin without-password\\\".\\n# If you just want the PAM account and session checks to run without\\n# PAM authentication, then enable this but set PasswordAuthentication\\n# and ChallengeResponseAuthentication to 'no'.\\n#UsePAM no\\n\\n#AllowAgentForwarding yes\\n#AllowTcpForwarding yes\\n#GatewayPorts no\\n#X11Forwarding no\\n#X11DisplayOffset 10\\n#X11UseLocalhost yes\\n#PermitTTY yes\\n#PrintMotd yes\\n#PrintLastLog yes\\n#TCPKeepAlive yes\\n#PermitUserEnvironment no\\n#Compression delayed\\n#ClientAliveInterval 0\\n#ClientAliveCountMax 3\\n#UseDNS no\\n#PidFile /var/run/sshd.pid\\n#MaxStartups 10:30:100\\n#PermitTunnel no\\n#ChrootDirectory none\\n#VersionAddendum none\\n\\n# no default banner path\\n#Banner none\\n\\n# override default of no subsystems\\nSubsystem\\tsftp\\t/usr/local/openssh-7.8p1/libexec/sftp-server\\n\\n# Example of overriding settings on a per-user basis\\n#Match User anoncvs\\n#\\tX11Forwarding no\\n#\\tAllowTcpForwarding no\\n#\\tPermitTTY no\\n#\\tForceCommand cvs server\\n</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1030\\\">\\n        <state>complete</state>\\n        <result>noexist</result>\\n    </objects>\\n    <objects id=\\\"linux-obj-1032\\\">\\n        <state>complete</state>\\n        <result>noexist</result>\\n    </objects>\\n    <objects id=\\\"linux-obj-1031\\\">\\n        <state>complete</state>\\n        <result>noexist</result>\\n    </objects>\\n    <objects id=\\\"linux-obj-1034\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data># Users that are not allowed to login via ftp\\nroot\\nbin\\ndaemon\\nadm\\nlp\\nsync\\nshutdown\\nhalt\\nmail\\nnews\\nuucp\\noperator\\ngames\\nnobody\\n</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1033\\\">\\n        <state>complete</state>\\n        <result>noexist</result>\\n    </objects>\\n    <objects id=\\\"linux-obj-1035\\\">\\n        <state>complete</state>\\n        <result>noexist</result>\\n    </objects>\\n    <objects id=\\\"linux-obj-1036\\\">\\n        <state>complete</state>\\n        <result>noexist</result>\\n    </objects>\\n    <objects id=\\\"linux-obj-1037\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>#%PAM-1.0\\nsession    optional     pam_keyinit.so    force revoke\\nauth       required\\tpam_listfile.so item=user sense=deny file=/etc/vsftpd/ftpusers onerr=succeed\\nauth       required\\tpam_shells.so\\nauth       include\\tsystem-auth\\naccount    include\\tsystem-auth\\nsession    include\\tsystem-auth\\nsession    required     pam_loginuid.so\\n</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1038\\\">\\n        <state>complete</state>\\n        <result>noexist</result>\\n    </objects>\\n    <objects id=\\\"linux-obj-1039\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data># Example config file /etc/vsftpd/vsftpd.conf\\n#\\n# The default compiled in settings are fairly paranoid. This sample file\\n# loosens things up a bit, to make the ftp daemon more usable.\\n# Please see vsftpd.conf.5 for all compiled in defaults.\\n#\\n# READ THIS: This example file is NOT an exhaustive list of vsftpd options.\\n# Please read the vsftpd.conf.5 manual page to get a full idea of vsftpd's\\n# capabilities.\\n#\\n# Allow anonymous FTP? (Beware - allowed by default if you comment this out).\\nanonymous_enable=YES\\n#\\n# Uncomment this to allow local users to log in.\\nlocal_enable=YES\\n#\\n# Uncomment this to enable any form of FTP write command.\\nwrite_enable=YES\\n#\\n# Default umask for local users is 077. You may wish to change this to 022,\\n# if your users expect that (022 is used by most other ftpd's)\\nlocal_umask=022\\n#\\n# Uncomment this to allow the anonymous FTP user to upload files. This only\\n# has an effect if the above global write enable is activated. Also, you will\\n# obviously need to create a directory writable by the FTP user.\\n#anon_upload_enable=YES\\n#\\n# Uncomment this if you want the anonymous FTP user to be able to create\\n# new directories.\\n#anon_mkdir_write_enable=YES\\n#\\n# Activate directory messages - messages given to remote users when they\\n# go into a certain directory.\\ndirmessage_enable=YES\\n#\\n# The target log file can be vsftpd_log_file or xferlog_file.\\n# This depends on setting xferlog_std_format parameter\\nxferlog_enable=YES\\n#\\n# Make sure PORT transfer connections originate from port 20 (ftp-data).\\nconnect_from_port_20=YES\\n#\\n# If you want, you can arrange for uploaded anonymous files to be owned by\\n# a different user. Note! Using \\\"root\\\" for uploaded files is not\\n# recommended!\\n#chown_uploads=YES\\n#chown_username=whoever\\n#\\n# The name of log file when xferlog_enable=YES and xferlog_std_format=YES\\n# WARNING - changing this filename affects /etc/logrotate.d/vsftpd.log\\n#xferlog_file=/var/log/xferlog\\n#\\n# Switches between logging into vsftpd_log_file and xferlog_file files.\\n# NO writes to vsftpd_log_file, YES to xferlog_file\\nxferlog_std_format=YES\\n#\\n# You may change the default value for timing out an idle session.\\n#idle_session_timeout=600\\n#\\n# You may change the default value for timing out a data connection.\\n#data_connection_timeout=120\\n#\\n# It is recommended that you define on your system a unique user which the\\n# ftp server can use as a totally isolated and unprivileged user.\\n#nopriv_user=ftpsecure\\n#\\n# Enable this and the server will recognise asynchronous ABOR requests. Not\\n# recommended for security (the code is non-trivial). Not enabling it,\\n# however, may confuse older FTP clients.\\n#async_abor_enable=YES\\n#\\n# By default the server will pretend to allow ASCII mode but in fact ignore\\n# the request. Turn on the below options to have the server actually do ASCII\\n# mangling on files when in ASCII mode.\\n# Beware that on some FTP servers, ASCII support allows a denial of service\\n# attack (DoS) via the command \\\"SIZE /big/file\\\" in ASCII mode. vsftpd\\n# predicted this attack and has always been safe, reporting the size of the\\n# raw file.\\n# ASCII mangling is a horrible feature of the protocol.\\n#ascii_upload_enable=YES\\n#ascii_download_enable=YES\\n#\\n# You may fully customise the login banner string:\\n#ftpd_banner=Welcome to blah FTP service.\\n#\\n# You may specify a file of disallowed anonymous e-mail addresses. Apparently\\n# useful for combatting certain DoS attacks.\\n#deny_email_enable=YES\\n# (default follows)\\n#banned_email_file=/etc/vsftpd/banned_emails\\n#\\n# You may specify an explicit list of local users to chroot() to their home\\n# directory. If chroot_local_user is YES, then this list becomes a list of\\n# users to NOT chroot().\\n#chroot_list_enable=YES\\n# (default follows)\\n#chroot_list_file=/etc/vsftpd/chroot_list\\n#\\n# You may activate the \\\"-R\\\" option to the builtin ls. This is disabled by\\n# default to avoid remote users being able to cause excessive I/O on large\\n# sites. However, some broken FTP clients such as \\\"ncftp\\\" and \\\"mirror\\\" assume\\n# the presence of the \\\"-R\\\" option, so there is a strong case for enabling it.\\n#ls_recurse_enable=YES\\n#\\n# When \\\"listen\\\" directive is enabled, vsftpd runs in standalone mode and \\n# listens on IPv4 sockets. This directive cannot be used in conjunction \\n# with the listen_ipv6 directive.\\nlisten=YES\\n#\\n# This directive enables listening on IPv6 sockets. To listen on IPv4 and IPv6\\n# sockets, you must run two copies of vsftpd whith two configuration files.\\n# Make sure, that one of the listen options is commented !!\\n#listen_ipv6=YES\\n\\npam_service_name=vsftpd\\nuserlist_enable=YES\\ntcp_wrappers=YES\\n</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1018\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>-rw-------;</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1017\\\">\\n        <state>complete</state>\\n        <result>noexist</result>\\n    </objects>\\n    <objects id=\\\"linux-obj-1019\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>-rw-------;</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1014\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>sshd           \\t0:off\\t1:off\\t2:on\\t3:on\\t4:on\\t5:on\\t6:off;</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1013\\\">\\n        <state>complete</state>\\n        <result>noexist</result>\\n        <data></data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1016\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data># Log all kernel messages to the console.\\n# Logging much else clutters up the screen.\\n#kern.*\\t\\t\\t\\t\\t\\t\\t/dev/console\\n\\n# Log anything (except mail) of level info or higher.\\n# Don't log private authentication messages!\\n*.info;mail.none;authpriv.none;cron.none\\t\\t/var/log/messages\\n\\n# The authpriv file has restricted access.\\nauthpriv.*\\t\\t\\t\\t\\t\\t/var/log/secure\\n\\n# Log all the mail messages in one place.\\nmail.*\\t\\t\\t\\t\\t\\t\\t-/var/log/maillog\\n\\n\\n# Log cron stuff\\ncron.*\\t\\t\\t\\t\\t\\t\\t/var/log/cron\\n\\n# Everybody gets emergency messages\\n*.emerg\\t\\t\\t\\t\\t\\t\\t*\\n\\n# Save news errors of level crit and higher in a special file.\\nuucp,news.crit\\t\\t\\t\\t\\t\\t/var/log/spooler\\n\\n# Save boot messages also to boot.log\\nlocal7.*\\t\\t\\t\\t\\t\\t/var/log/boot.log\\n</data>\\n    </objects>\\n    <objects id=\\\"linux-obj-1015\\\">\\n        <state>complete</state>\\n        <result>noexist</result>\\n        <data>/bin/sh: systemctl: command not found;</data>\\n    </objects>\\n</root>\\n\",\n" +
                "  \"name\": \"jt-os-linux.xml\",\n" +
                "  \"time\": 1543387825162,\n" +
                "  \"type\": \"os\",\n" +
                "  \"uid\": \"linux\"\n" +
                "}]";
		String string2 = "[\n" +
                "  {\n" +
                "  \"data\": \"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\" ?>\\n<root>\\n    <objects id=\\\"window-obj-1010\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>文件系统的类型是 NTFS。\\nC: 没问题。\\n</data>\\n    </objects>\\n    <objects id=\\\"window-obj-1005\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>1</data>\\n    </objects>\\n    <objects id=\\\"window-obj-1004\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>1</data>\\n    </objects>\\n    <objects id=\\\"window-obj-1021\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>1024</data>\\n    </objects>\\n    <objects id=\\\"window-obj-1003\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>[Unicode]\\nUnicode=yes\\n[System Access]\\nMinimumPasswordAge = 0\\nMaximumPasswordAge = 90\\nMinimumPasswordLength = 8\\nPasswordComplexity = 1\\nPasswordHistorySize = 5\\nLockoutBadCount = 6\\nResetLockoutCount = 30\\nLockoutDuration = 30\\nRequireLogonToChangePassword = 0\\nForceLogoffWhenHourExpire = 0\\nNewAdministratorName = \\\"Transfar\\\"\\nNewGuestName = \\\"Guest\\\"\\nClearTextPassword = 0\\nLSAAnonymousNameLookup = 0\\nEnableAdminAccount = 1\\nEnableGuestAccount = 0\\n[Event Audit]\\nAuditSystemEvents = 3\\nAuditLogonEvents = 3\\nAuditObjectAccess = 1\\nAuditPrivilegeUse = 3\\nAuditPolicyChange = 3\\nAuditAccountManage = 3\\nAuditProcessTracking = 3\\nAuditDSAccess = 3\\nAuditAccountLogon = 3\\n[Version]\\nsignature=\\\"$CHICAGO$\\\"\\nRevision=1\\n[Registry Values]\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows NT\\\\CurrentVersion\\\\Setup\\\\RecoveryConsole\\\\SecurityLevel=4,0\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows NT\\\\CurrentVersion\\\\Setup\\\\RecoveryConsole\\\\SetCommand=4,0\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows NT\\\\CurrentVersion\\\\Winlogon\\\\CachedLogonsCount=1,\\\"10\\\"\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows NT\\\\CurrentVersion\\\\Winlogon\\\\ForceUnlockLogon=4,0\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows NT\\\\CurrentVersion\\\\Winlogon\\\\PasswordExpiryWarning=4,5\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows NT\\\\CurrentVersion\\\\Winlogon\\\\ScRemoveOption=1,\\\"0\\\"\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows\\\\CurrentVersion\\\\Policies\\\\System\\\\ConsentPromptBehaviorAdmin=4,5\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows\\\\CurrentVersion\\\\Policies\\\\System\\\\ConsentPromptBehaviorUser=4,3\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows\\\\CurrentVersion\\\\Policies\\\\System\\\\DisableCAD=4,0\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows\\\\CurrentVersion\\\\Policies\\\\System\\\\DontDisplayLastUserName=4,0\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows\\\\CurrentVersion\\\\Policies\\\\System\\\\EnableInstallerDetection=4,1\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows\\\\CurrentVersion\\\\Policies\\\\System\\\\EnableLUA=4,1\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows\\\\CurrentVersion\\\\Policies\\\\System\\\\EnableSecureUIAPaths=4,1\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows\\\\CurrentVersion\\\\Policies\\\\System\\\\EnableUIADesktopToggle=4,0\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows\\\\CurrentVersion\\\\Policies\\\\System\\\\EnableVirtualization=4,1\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows\\\\CurrentVersion\\\\Policies\\\\System\\\\FilterAdministratorToken=4,0\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows\\\\CurrentVersion\\\\Policies\\\\System\\\\LegalNoticeCaption=1,\\\"\\\"\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows\\\\CurrentVersion\\\\Policies\\\\System\\\\LegalNoticeText=7,\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows\\\\CurrentVersion\\\\Policies\\\\System\\\\PromptOnSecureDesktop=4,1\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows\\\\CurrentVersion\\\\Policies\\\\System\\\\ScForceOption=4,0\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows\\\\CurrentVersion\\\\Policies\\\\System\\\\ShutdownWithoutLogon=4,0\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows\\\\CurrentVersion\\\\Policies\\\\System\\\\UndockWithoutLogon=4,1\\nMACHINE\\\\Software\\\\Microsoft\\\\Windows\\\\CurrentVersion\\\\Policies\\\\System\\\\ValidateAdminCodeSignatures=4,0\\nMACHINE\\\\Software\\\\Policies\\\\Microsoft\\\\Windows\\\\Safer\\\\CodeIdentifiers\\\\AuthenticodeEnabled=4,0\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Control\\\\Lsa\\\\AuditBaseObjects=4,0\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Control\\\\Lsa\\\\CrashOnAuditFail=4,0\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Control\\\\Lsa\\\\DisableDomainCreds=4,0\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Control\\\\Lsa\\\\EveryoneIncludesAnonymous=4,0\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Control\\\\Lsa\\\\FIPSAlgorithmPolicy\\\\Enabled=4,0\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Control\\\\Lsa\\\\ForceGuest=4,0\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Control\\\\Lsa\\\\FullPrivilegeAuditing=3,0\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Control\\\\Lsa\\\\LimitBlankPasswordUse=4,1\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Control\\\\Lsa\\\\MSV1_0\\\\NTLMMinClientSec=4,536870912\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Control\\\\Lsa\\\\MSV1_0\\\\NTLMMinServerSec=4,536870912\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Control\\\\Lsa\\\\NoLMHash=4,1\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Control\\\\Lsa\\\\RestrictAnonymous=4,2\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Control\\\\Lsa\\\\RestrictAnonymousSAM=4,1\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Control\\\\Print\\\\Providers\\\\LanMan Print Services\\\\Servers\\\\AddPrinterDrivers=4,1\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Control\\\\SecurePipeServers\\\\Winreg\\\\AllowedExactPaths\\\\Machine=7,System\\\\CurrentControlSet\\\\Control\\\\ProductOptions,System\\\\CurrentControlSet\\\\Control\\\\Server Applications,Software\\\\Microsoft\\\\Windows NT\\\\CurrentVersion\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Control\\\\SecurePipeServers\\\\Winreg\\\\AllowedPaths\\\\Machine=7,System\\\\CurrentControlSet\\\\Control\\\\Print\\\\Printers,System\\\\CurrentControlSet\\\\Services\\\\Eventlog,Software\\\\Microsoft\\\\OLAP Server,Software\\\\Microsoft\\\\Windows NT\\\\CurrentVersion\\\\Print,Software\\\\Microsoft\\\\Windows NT\\\\CurrentVersion\\\\Windows,System\\\\CurrentControlSet\\\\Control\\\\ContentIndex,System\\\\CurrentControlSet\\\\Control\\\\Terminal Server,System\\\\CurrentControlSet\\\\Control\\\\Terminal Server\\\\UserConfig,System\\\\CurrentControlSet\\\\Control\\\\Terminal Server\\\\DefaultUserConfiguration,Software\\\\Microsoft\\\\Windows NT\\\\CurrentVersion\\\\Perflib,System\\\\CurrentControlSet\\\\Services\\\\SysmonLog\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Control\\\\Session Manager\\\\Kernel\\\\ObCaseInsensitive=4,1\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Control\\\\Session Manager\\\\Memory Management\\\\ClearPageFileAtShutdown=4,0\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Control\\\\Session Manager\\\\ProtectionMode=4,1\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Control\\\\Session Manager\\\\SubSystems\\\\optional=7,Posix\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Services\\\\LanManServer\\\\Parameters\\\\AutoDisconnect=4,15\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Services\\\\LanManServer\\\\Parameters\\\\EnableForcedLogOff=4,1\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Services\\\\LanManServer\\\\Parameters\\\\EnableSecuritySignature=4,0\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Services\\\\LanManServer\\\\Parameters\\\\NullSessionPipes=7,\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Services\\\\LanManServer\\\\Parameters\\\\RequireSecuritySignature=4,0\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Services\\\\LanManServer\\\\Parameters\\\\RestrictNullSessAccess=4,1\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Services\\\\LanmanWorkstation\\\\Parameters\\\\EnablePlainTextPassword=4,0\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Services\\\\LanmanWorkstation\\\\Parameters\\\\EnableSecuritySignature=4,1\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Services\\\\LanmanWorkstation\\\\Parameters\\\\RequireSecuritySignature=4,0\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Services\\\\LDAP\\\\LDAPClientIntegrity=4,1\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Services\\\\Netlogon\\\\Parameters\\\\DisablePasswordChange=4,0\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Services\\\\Netlogon\\\\Parameters\\\\MaximumPasswordAge=4,30\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Services\\\\Netlogon\\\\Parameters\\\\RequireSignOrSeal=4,1\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Services\\\\Netlogon\\\\Parameters\\\\RequireStrongKey=4,1\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Services\\\\Netlogon\\\\Parameters\\\\SealSecureChannel=4,1\\nMACHINE\\\\System\\\\CurrentControlSet\\\\Services\\\\Netlogon\\\\Parameters\\\\SignSecureChannel=4,1\\n[Privilege Rights]\\nSeNetworkLogonRight = *S-1-1-0,*S-1-5-32-544,*S-1-5-32-545,*S-1-5-32-551\\nSeBackupPrivilege = *S-1-5-32-544,*S-1-5-32-551\\nSeChangeNotifyPrivilege = *S-1-1-0,*S-1-5-19,*S-1-5-20,SQLServerDTSUser$WIN-GGIJGO1UO32,SQLServerSQLAgentUser$WIN-GGIJGO1UO32$MSSQLSERVER,*S-1-5-32-544,*S-1-5-32-545,*S-1-5-32-551,*S-1-5-80-3263513310-3392720605-1798839546-683002060-3227631582,*S-1-5-80-3880718306-3832830129-1677859214-2598158968-1052248003\\nSeSystemtimePrivilege = *S-1-5-19,*S-1-5-32-544\\nSeCreatePagefilePrivilege = *S-1-5-32-544\\nSeDebugPrivilege = *S-1-5-32-544\\nSeRemoteShutdownPrivilege = *S-1-5-32-544\\nSeAuditPrivilege = *S-1-5-19,*S-1-5-20,Classic .NET AppPool,DefaultAppPool\\nSeIncreaseQuotaPrivilege = *S-1-5-19,*S-1-5-20,SQLServerSQLAgentUser$WIN-GGIJGO1UO32$MSSQLSERVER,*S-1-5-32-544,*S-1-5-80-3263513310-3392720605-1798839546-683002060-3227631582,*S-1-5-80-3880718306-3832830129-1677859214-2598158968-1052248003,Classic .NET AppPool,DefaultAppPool\\nSeIncreaseBasePriorityPrivilege = *S-1-5-32-544\\nSeLoadDriverPrivilege = *S-1-5-32-544\\nSeBatchLogonRight = *S-1-5-32-544,*S-1-5-32-551,*S-1-5-32-559,*S-1-5-32-568\\nSeServiceLogonRight = *S-1-5-18,*S-1-5-19,SQLServerReportServerUser$WIN-GGIJGO1UO32$MSRS10_50.MSSQLSERVER,SQLServerDTSUser$WIN-GGIJGO1UO32,SQLServer2005SQLBrowserUser$WIN-GGIJGO1UO32,SQLServerMSASUser$WIN-GGIJGO1UO32$MSSQLSERVER,SQLServerSQLAgentUser$WIN-GGIJGO1UO32$MSSQLSERVER,*S-1-5-80-0,*S-1-5-80-3263513310-3392720605-1798839546-683002060-3227631582,*S-1-5-80-3880718306-3832830129-1677859214-2598158968-1052248003,Classic .NET AppPool,DefaultAppPool\\nSeInteractiveLogonRight = *S-1-5-32-544,*S-1-5-32-545,*S-1-5-32-551\\nSeSecurityPrivilege = *S-1-5-32-544\\nSeSystemEnvironmentPrivilege = *S-1-5-32-544\\nSeProfileSingleProcessPrivilege = *S-1-5-32-544\\nSeSystemProfilePrivilege = *S-1-5-32-544,*S-1-5-80-3139157870-2983391045-3678747466-658725712-1809340420\\nSeAssignPrimaryTokenPrivilege = *S-1-5-19,*S-1-5-20,SQLServerSQLAgentUser$WIN-GGIJGO1UO32$MSSQLSERVER,*S-1-5-80-3263513310-3392720605-1798839546-683002060-3227631582,*S-1-5-80-3880718306-3832830129-1677859214-2598158968-1052248003,Classic .NET AppPool,DefaultAppPool\\nSeRestorePrivilege = *S-1-5-32-544,*S-1-5-32-551\\nSeShutdownPrivilege = *S-1-5-32-544\\nSeTakeOwnershipPrivilege = *S-1-5-32-544\\nSeUndockPrivilege = *S-1-5-32-544\\nSeManageVolumePrivilege = *S-1-5-32-544\\nSeRemoteInteractiveLogonRight = *S-1-5-32-544,*S-1-5-32-555\\nSeImpersonatePrivilege = *S-1-5-19,*S-1-5-20,SQLServerDTSUser$WIN-GGIJGO1UO32,*S-1-5-32-544,*S-1-5-32-568,*S-1-5-6\\nSeCreateGlobalPrivilege = *S-1-5-19,*S-1-5-20,SQLServerDTSUser$WIN-GGIJGO1UO32,*S-1-5-32-544,*S-1-5-6\\nSeIncreaseWorkingSetPrivilege = *S-1-5-32-545\\nSeTimeZonePrivilege = *S-1-5-19,*S-1-5-32-544\\nSeCreateSymbolicLinkPrivilege = *S-1-5-32-544\\n</data>\\n    </objects>\\n    <objects id=\\\"window-obj-1012\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>99999</data>\\n    </objects>\\n    <objects id=\\\"window-obj-1020\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>1280</data>\\n    </objects>\\n    <objects id=\\\"window-obj-1002\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>帐户启用               No\\n</data>\\n    </objects>\\n    <objects id=\\\"window-obj-1011\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data></data>\\n    </objects>\\n    <objects id=\\\"window-obj-1014\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>15</data>\\n    </objects>\\n    <objects id=\\\"window-obj-1001\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>\\n\\\\\\\\WIN-GGIJGO1UO32 的用户帐户\\n\\n-------------------------------------------------------------------------------\\nGuest                    Transfar                 \\n命令成功完成。\\n\\n</data>\\n    </objects>\\n    <objects id=\\\"window-obj-1013\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>99999</data>\\n    </objects>\\n    <objects id=\\\"window-obj-1016\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>2</data>\\n    </objects>\\n    <objects id=\\\"window-obj-1015\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>0\\u0000</data>\\n    </objects>\\n    <objects id=\\\"window-obj-1018\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>1</data>\\n    </objects>\\n    <objects id=\\\"window-obj-1017\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>2</data>\\n    </objects>\\n    <objects id=\\\"window-obj-1019\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>5</data>\\n    </objects>\\n    <objects id=\\\"window-obj-1009\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>0</data>\\n    </objects>\\n    <objects id=\\\"window-obj-1008\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>255</data>\\n    </objects>\\n    <objects id=\\\"window-obj-1007\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>3388</data>\\n    </objects>\\n    <objects id=\\\"window-obj-1006\\\">\\n        <state>complete</state>\\n        <result>exist</result>\\n        <data>1</data>\\n    </objects>\\n</root>\\n\",\n" +
                "  \"name\": \"jt-os-windows.xml\",\n" +
                "  \"time\": 1541141087700,\n" +
                "  \"type\": \"os\",\n" +
                "  \"uid\": \"windows\"\n" +
                "}\n" +
                "]";

		// JSONObject.parseObject()
        List<Baseline> objects = JSONArray.parseArray(string2, Baseline.class);
        System.out.println(objects.toString());

        // String str2 = "aaaaaaaa\"";
        // System.out.println(str2);
        // System.out.println(str2.replace("\"", "\\\""));

        // String strings = "[{\"name\": \"jt-os-linux.xml\",\"time\":            1543387825162,\"type\": \"os\",\"uid\": \"linux\"}]";
        // JSONArray objects = JSONArray.parseArray(strings);
        // System.out.println(objects.toString());







    }

    @Test
    public void test3() {
        String aa = "";
        String[] split = aa.split(",");
        System.out.println(split[0]);
        List<String> strings = Arrays.asList(aa);
        System.out.println(strings);
    }

    @Test
    public void test4() {
	    String aaa = "777\\'777";
        System.out.println(aaa);
		String s = aaa.replaceAll("\\\\\'", "'");
		System.out.println(s);
		System.out.println(aaa);
    }
    
    @Test
    public void test5() {
		String str = "{\n" +
				"  \"host\": {\n" +
				"    \"ethList\": [\n" +
				"      {\n" +
				"        \"broadcast\": \"123\",\n" +
				"        \"hwaddr\": \"1232131\",\n" +
				"        \"address\": \"192.168.1.1\",\n" +
				"        \"metric\": \"123\",\n" +
				"        \"netmask\": \"255.255.255.0\",\n" +
				"        \"destination\": \"192.168.1.1\",\n" +
				"        \"flags\": \"123\",\n" +
				"        \"name\": \"0326-netcard-02\",\n" +
				"        \"description\": \"0326-netcard-02\",\n" +
				"        \"type\": \"1\",\n" +
				"        \"ipType\": \"ipv4\",\n" +
				"        \"mtu\": \"123\"\n" +
				"      }\n" +
				"    ],\n" +
				"    \"os\": {\n" +
				"      \"vendorVersion\": \"\",\n" +
				"      \"name\": \"1\",\n" +
				"      \"patchLevel\": \"\",\n" +
				"      \"issueVersion\": \"\",\n" +
				"      \"version\": \"\"\n" +
				"    },\n" +
				"    \"hostNameCn\": \"test_0327\",\n" +
				"    \"attrs\": {\n" +
				"      \"bind\": \"\",\n" +
				"      \"openssl\": \"\",\n" +
				"      \"ntpd\": \"\",\n" +
				"      \"samba\": \"\",\n" +
				"      \"vsftpd\": \"\"\n" +
				"    }\n" +
				"  },\n" +
				"  \"said\": \"1D36451EB15714C4199A85600F92C9181\",\n" +
				"  \"apps\": []\n" +
				"}\n";
        JSONObject object = JSON.parseObject(str);
        JSONObject host = (JSONObject) object.get("host");
        host.remove("hostNameCn");
        Object hostNameCn = host.get("hostNameCn");
        System.out.println(hostNameCn);


    }

    @Test
    public void test6() {
		String string = "";
		if (string != null && string.isEmpty()) {
			System.out.println("string is empty");
		}

		String sysPorts = "a:1111;b:2222";
		List<String> ports = Arrays.asList(sysPorts.split(";"));
		// ports.forEach();
		String jsonString = "{\"apps\": [\"1\", \"2\"]}";
		// String jsonString = "{\"apps\": {\"1\", \"2\"}}";
        JSONObject json = JSONObject.parseObject(jsonString);
        String[] apps1 = (String[]) json.get("apps");
        List<String> apps2 = (List<String>) json.get("apps");
        System.out.println(apps1);
        System.out.println(apps2);
    }

    @Test
    public void testSubString() {
        String str = "abcde";
        String str1 = str.substring(0, str.indexOf("bc"));
        String str2 = str.substring(1, 3);
        System.out.println(str1);
        System.out.println(str2);
    }

	@Test
	public void testSubString2() {
		String str = "abcde";
		str += ",,";
        String substring = str.substring(0, str.lastIndexOf(","));
        System.out.println(substring);

        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        // System.out.println(stringList);
        // System.out.println(stringList.toString());
		// String ciIds = "1,2,3,4,5,6,";
		// System.out.println(ciIds.substring(0, ciIds.lastIndexOf(",")));
		// 等价于上面的语法
		System.out.println(StringUtils.join(stringList, ","));

		Set<String> stringSet = new HashSet<>();
		stringSet.add("1");
		stringSet.add("2");
		System.out.println(StringUtils.join(stringSet, ","));

	}

	@Test
	public void testTime() {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String nowTime = "2020-04-23 14:49:19";
		LocalDateTime parse = LocalDateTime.parse(nowTime, dtf);
		Long nowTimestamp = LocalDateTime.from(parse).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() / 1000;
		System.out.println(nowTimestamp);

		Long long1 = 1587624559L;
		Long long2 = 1587624259L + 3 * 60;
		if (long1 >= long2) {
			System.out.println(long2);
		}
	}

	@Test
	public void testMap() {

		List<Map<String, String>> mapList = new ArrayList<>();
		Map<String, String> map = new HashMap<>();
		map.put("aa", "aa");
		mapList.add(map);
		Map<String, String> map2 = new HashMap<>();
		map2.put("aa", "aa");

		mapList.forEach(e -> {
			e.put("bb", "bb");
			map2.put("bb", "bb");
		});

		System.out.println(mapList.toString());
		System.out.println(map2.toString());


	}
	
	@Test
	public void testJsonString() {
        // String json = "[{\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"100\", \"treeParentNodeId\": \"0\", \"treeNodeName\": \"CI系统视图\", \"sLevel\": \"1\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"512\", \"treeParentNodeId\": \"100\", \"treeNodeName\": \"硬件\", \"sLevel\": \"2\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"514\", \"treeParentNodeId\": \"512\", \"treeNodeName\": \"主机\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 100101, \"treeNodeId\": \"516\", \"treeParentNodeId\": \"514\", \"treeNodeName\": \"HpUnix主机\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 100102, \"treeNodeId\": \"518\", \"treeParentNodeId\": \"514\", \"treeNodeName\": \"AIX主机\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 100103, \"treeNodeId\": \"520\", \"treeParentNodeId\": \"514\", \"treeNodeName\": \"SunOS主机\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 100104, \"treeNodeId\": \"522\", \"treeParentNodeId\": \"514\", \"treeNodeName\": \"HpTru64主机\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 100106, \"treeNodeId\": \"524\", \"treeParentNodeId\": \"514\", \"treeNodeName\": \"ScoUnix主机\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 100105, \"treeNodeId\": \"526\", \"treeParentNodeId\": \"514\", \"treeNodeName\": \"Linux主机\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 100107, \"treeNodeId\": \"528\", \"treeParentNodeId\": \"514\", \"treeNodeName\": \"Windows主机\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 2001, \"treeNodeId\": \"694\", \"treeParentNodeId\": \"514\", \"treeNodeName\": \"个人PC\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900001021, \"treeNodeId\": \"1033\", \"treeParentNodeId\": \"514\", \"treeNodeName\": \"Windows虚拟机\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900001022, \"treeNodeId\": \"1034\", \"treeParentNodeId\": \"514\", \"treeNodeName\": \"Linux虚拟机\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900001023, \"treeNodeId\": \"1035\", \"treeParentNodeId\": \"514\", \"treeNodeName\": \"其他虚拟机\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 2003, \"treeNodeId\": \"1191\", \"treeParentNodeId\": \"514\", \"treeNodeName\": \"带外主机\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"530\", \"treeParentNodeId\": \"512\", \"treeNodeName\": \"网络\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 1103, \"treeNodeId\": \"532\", \"treeParentNodeId\": \"530\", \"treeNodeName\": \"防火墙\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 1102, \"treeNodeId\": \"534\", \"treeParentNodeId\": \"530\", \"treeNodeName\": \"路由器\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 142, \"treeNodeId\": \"536\", \"treeParentNodeId\": \"530\", \"treeNodeName\": \"通讯链路\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 1101, \"treeNodeId\": \"538\", \"treeParentNodeId\": \"530\", \"treeNodeName\": \"交换机\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 126, \"treeNodeId\": \"540\", \"treeParentNodeId\": \"530\", \"treeNodeName\": \"光纤交换机\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 127, \"treeNodeId\": \"542\", \"treeParentNodeId\": \"530\", \"treeNodeName\": \"负载均衡\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 12, \"treeNodeId\": \"692\", \"treeParentNodeId\": \"530\", \"treeNodeName\": \"IP段\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 1105, \"treeNodeId\": \"1005\", \"treeParentNodeId\": \"530\", \"treeNodeName\": \"IPS\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 1106, \"treeNodeId\": \"1007\", \"treeParentNodeId\": \"530\", \"treeNodeName\": \"WAF\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 1112, \"treeNodeId\": \"1214\", \"treeParentNodeId\": \"530\", \"treeNodeName\": \"其他SNMP设备\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 1110, \"treeNodeId\": \"1216\", \"treeParentNodeId\": \"530\", \"treeNodeName\": \"堆叠交换机\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 1113, \"treeNodeId\": \"1218\", \"treeParentNodeId\": \"530\", \"treeNodeName\": \"虚拟防火墙\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 10, \"treeNodeId\": \"18082\", \"treeParentNodeId\": \"530\", \"treeNodeName\": \"IP\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"544\", \"treeParentNodeId\": \"512\", \"treeNodeName\": \"存储设备\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 1004, \"treeNodeId\": \"546\", \"treeParentNodeId\": \"544\", \"treeNodeName\": \"磁带库\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 1003, \"treeNodeId\": \"548\", \"treeParentNodeId\": \"544\", \"treeNodeName\": \"磁盘阵列\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900002000, \"treeNodeId\": \"1070\", \"treeParentNodeId\": \"544\", \"treeNodeName\": \"IBM DS存储设备\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900002005, \"treeNodeId\": \"1130\", \"treeParentNodeId\": \"544\", \"treeNodeName\": \"V7000存储设备\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 1300, \"treeNodeId\": \"1212\", \"treeParentNodeId\": \"544\", \"treeNodeName\": \"华为存储18500\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 1301, \"treeNodeId\": \"1213\", \"treeParentNodeId\": \"544\", \"treeNodeName\": \"华为存储S5900\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 1400, \"treeNodeId\": \"1246\", \"treeParentNodeId\": \"544\", \"treeNodeName\": \"通用存储\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"713\", \"treeParentNodeId\": \"512\", \"treeNodeName\": \"虚拟硬件\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 900001011, \"treeNodeId\": \"714\", \"treeParentNodeId\": \"713\", \"treeNodeName\": \"宿主机\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900001002, \"treeNodeId\": \"715\", \"treeParentNodeId\": \"713\", \"treeNodeName\": \"虚拟机\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900001008, \"treeNodeId\": \"716\", \"treeParentNodeId\": \"713\", \"treeNodeName\": \"虚拟数据存储\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900001007, \"treeNodeId\": \"717\", \"treeParentNodeId\": \"713\", \"treeNodeName\": \"虚拟交换机\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900001000, \"treeNodeId\": \"718\", \"treeParentNodeId\": \"713\", \"treeNodeName\": \"资源区\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900001001, \"treeNodeId\": \"719\", \"treeParentNodeId\": \"713\", \"treeNodeName\": \"集群\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900000993, \"treeNodeId\": \"1110\", \"treeParentNodeId\": \"713\", \"treeNodeName\": \"机架\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900001040, \"treeNodeId\": \"1258\", \"treeParentNodeId\": \"713\", \"treeNodeName\": \"分布式交换机\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 938, \"treeNodeId\": \"1072\", \"treeParentNodeId\": \"512\", \"treeNodeName\": \"机房\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 32, \"treeNodeId\": \"1192\", \"treeParentNodeId\": \"512\", \"treeNodeName\": \"刀片机框\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"550\", \"treeParentNodeId\": \"100\", \"treeNodeName\": \"系统软件\", \"sLevel\": \"2\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"552\", \"treeParentNodeId\": \"550\", \"treeNodeName\": \"数据库\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 200201, \"treeNodeId\": \"554\", \"treeParentNodeId\": \"552\", \"treeNodeName\": \"oracle\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 200202, \"treeNodeId\": \"556\", \"treeParentNodeId\": \"552\", \"treeNodeName\": \"sybase\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 200203, \"treeNodeId\": \"558\", \"treeParentNodeId\": \"552\", \"treeNodeName\": \"mssqlserver\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 200204, \"treeNodeId\": \"560\", \"treeParentNodeId\": \"552\", \"treeNodeName\": \"informix\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 200205, \"treeNodeId\": \"562\", \"treeParentNodeId\": \"552\", \"treeNodeName\": \"db2\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 200206, \"treeNodeId\": \"564\", \"treeParentNodeId\": \"552\", \"treeNodeName\": \"tt\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 200208, \"treeNodeId\": \"1011\", \"treeParentNodeId\": \"552\", \"treeNodeName\": \"mysql\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 200207, \"treeNodeId\": \"1053\", \"treeParentNodeId\": \"552\", \"treeNodeName\": \"TeraData\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 200209, \"treeNodeId\": \"1150\", \"treeParentNodeId\": \"552\", \"treeNodeName\": \"ORACLE12c\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900006095, \"treeNodeId\": \"1238\", \"treeParentNodeId\": \"552\", \"treeNodeName\": \"HBASE\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900006031, \"treeNodeId\": \"1239\", \"treeParentNodeId\": \"552\", \"treeNodeName\": \"HMaster\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900006032, \"treeNodeId\": \"1244\", \"treeParentNodeId\": \"552\", \"treeNodeName\": \"HRegionServer\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900006026, \"treeNodeId\": \"14390\", \"treeParentNodeId\": \"552\", \"treeNodeName\": \"Cassandra集群\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900006025, \"treeNodeId\": \"14391\", \"treeParentNodeId\": \"552\", \"treeNodeName\": \"Cassandra\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"566\", \"treeParentNodeId\": \"550\", \"treeNodeName\": \"中间件\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 200401, \"treeNodeId\": \"568\", \"treeParentNodeId\": \"566\", \"treeNodeName\": \"tuxedo\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 200402, \"treeNodeId\": \"570\", \"treeParentNodeId\": \"566\", \"treeNodeName\": \"weblogic\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 200404, \"treeNodeId\": \"572\", \"treeParentNodeId\": \"566\", \"treeNodeName\": \"tomcat\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 200405, \"treeNodeId\": \"574\", \"treeParentNodeId\": \"566\", \"treeNodeName\": \"websphere\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 200406, \"treeNodeId\": \"576\", \"treeParentNodeId\": \"566\", \"treeNodeName\": \"apache\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 200407, \"treeNodeId\": \"578\", \"treeParentNodeId\": \"566\", \"treeNodeName\": \"iis\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 200408, \"treeNodeId\": \"580\", \"treeParentNodeId\": \"566\", \"treeNodeName\": \"siebel\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 970, \"treeNodeId\": \"17725\", \"treeParentNodeId\": \"566\", \"treeNodeName\": \"KingDee\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 934, \"treeNodeId\": \"18298\", \"treeParentNodeId\": \"566\", \"treeNodeName\": \"NSQ\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"582\", \"treeParentNodeId\": \"550\", \"treeNodeName\": \"BOSS网管代理\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 93, \"treeNodeId\": \"584\", \"treeParentNodeId\": \"582\", \"treeNodeName\": \"J_Agent\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 300601, \"treeNodeId\": \"586\", \"treeParentNodeId\": \"582\", \"treeNodeName\": \"C_Agent\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 300604, \"treeNodeId\": \"588\", \"treeParentNodeId\": \"582\", \"treeNodeName\": \"Proxy\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 300605, \"treeNodeId\": \"590\", \"treeParentNodeId\": \"582\", \"treeNodeName\": \"Manager\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 96, \"treeNodeId\": \"1210\", \"treeParentNodeId\": \"582\", \"treeNodeName\": \"Agent_Pool\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 2000, \"treeNodeId\": \"695\", \"treeParentNodeId\": \"550\", \"treeNodeName\": \"lanGuard软件\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 900001010, \"treeNodeId\": \"712\", \"treeParentNodeId\": \"550\", \"treeNodeName\": \"虚拟化管理软件\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 900001030, \"treeNodeId\": \"1132\", \"treeParentNodeId\": \"550\", \"treeNodeName\": \"双机监控软件\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 500001, \"treeNodeId\": \"1190\", \"treeParentNodeId\": \"550\", \"treeNodeName\": \"带外管理监控软件\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 1155, \"treeNodeId\": \"1226\", \"treeParentNodeId\": \"550\", \"treeNodeName\": \"网络设备管理中心\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"1234\", \"treeParentNodeId\": \"550\", \"treeNodeName\": \"hadoop分布式集群\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 900006060, \"treeNodeId\": \"1235\", \"treeParentNodeId\": \"1234\", \"treeNodeName\": \"Hadoop分布式集群\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900006061, \"treeNodeId\": \"1236\", \"treeParentNodeId\": \"1234\", \"treeNodeName\": \"HDFS\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900006030, \"treeNodeId\": \"1237\", \"treeParentNodeId\": \"1234\", \"treeNodeName\": \"Yarn\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900006027, \"treeNodeId\": \"1240\", \"treeParentNodeId\": \"1234\", \"treeNodeName\": \"NameNode\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900006044, \"treeNodeId\": \"1241\", \"treeParentNodeId\": \"1234\", \"treeNodeName\": \"NodeManager\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900006043, \"treeNodeId\": \"1242\", \"treeParentNodeId\": \"1234\", \"treeNodeName\": \"YarnResourceMgr\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 205, \"treeNodeId\": \"1243\", \"treeParentNodeId\": \"1234\", \"treeNodeName\": \"secondaryNamenode\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900006029, \"treeNodeId\": \"1245\", \"treeParentNodeId\": \"1234\", \"treeNodeName\": \"dataNode\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"14385\", \"treeParentNodeId\": \"550\", \"treeNodeName\": \"redis分布式缓存模块\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 200211, \"treeNodeId\": \"14386\", \"treeParentNodeId\": \"14385\", \"treeNodeName\": \"Redis\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900006040, \"treeNodeId\": \"14387\", \"treeParentNodeId\": \"14385\", \"treeNodeName\": \"分布式缓存集群\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900006035, \"treeNodeId\": \"14388\", \"treeParentNodeId\": \"550\", \"treeNodeName\": \"Zookeeper\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 900006045, \"treeNodeId\": \"14389\", \"treeParentNodeId\": \"550\", \"treeNodeName\": \"Keepalived\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 962, \"treeNodeId\": \"14397\", \"treeParentNodeId\": \"550\", \"treeNodeName\": \"Kafka集群\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 963, \"treeNodeId\": \"14762\", \"treeParentNodeId\": \"550\", \"treeNodeName\": \"Kafka\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 900008020, \"treeNodeId\": \"14788\", \"treeParentNodeId\": \"550\", \"treeNodeName\": \"Zookeeper集群\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 960, \"treeNodeId\": \"14798\", \"treeParentNodeId\": \"550\", \"treeNodeName\": \"Elasticsearch集群\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 900002302, \"treeNodeId\": \"14804\", \"treeParentNodeId\": \"550\", \"treeNodeName\": \"Elasticsearch\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 961, \"treeNodeId\": \"14814\", \"treeParentNodeId\": \"550\", \"treeNodeName\": \"Rabbitmq集群\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 300606, \"treeNodeId\": \"14855\", \"treeParentNodeId\": \"550\", \"treeNodeName\": \"RabbitMQ\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 900009027, \"treeNodeId\": \"16091\", \"treeParentNodeId\": \"550\", \"treeNodeName\": \"集约研发部RabbitMq集群\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 900009025, \"treeNodeId\": \"16085\", \"treeParentNodeId\": \"16091\", \"treeNodeName\": \"QUEUE\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900009026, \"treeNodeId\": \"16087\", \"treeParentNodeId\": \"16091\", \"treeNodeName\": \"MCENTER\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900009024, \"treeNodeId\": \"16089\", \"treeParentNodeId\": \"16091\", \"treeNodeName\": \"BROKER\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900002301, \"treeNodeId\": \"16182\", \"treeParentNodeId\": \"550\", \"treeNodeName\": \"Logstash\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"592\", \"treeParentNodeId\": \"100\", \"treeNodeName\": \"业务系统\", \"sLevel\": \"2\"}, {\"instanceId\": 0, \"classId\": 900000955, \"treeNodeId\": \"594\", \"treeParentNodeId\": \"592\", \"treeNodeName\": \"业务\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 100000100, \"treeNodeId\": \"393431\", \"treeParentNodeId\": \"594\", \"treeNodeName\": \"测试001\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"14480\", \"treeParentNodeId\": \"592\", \"treeNodeName\": \"BSS\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"14481\", \"treeParentNodeId\": \"592\", \"treeNodeName\": \"OSS\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 184, \"treeNodeId\": \"14498\", \"treeParentNodeId\": \"14481\", \"treeNodeName\": \"GIS选址系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 157, \"treeNodeId\": \"14531\", \"treeParentNodeId\": \"14481\", \"treeNodeName\": \"网络运维管理系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 159, \"treeNodeId\": \"14532\", \"treeParentNodeId\": \"14481\", \"treeNodeName\": \"综合网络管理系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 155, \"treeNodeId\": \"14553\", \"treeParentNodeId\": \"14481\", \"treeNodeName\": \"综合服务保障系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 158, \"treeNodeId\": \"14554\", \"treeParentNodeId\": \"14481\", \"treeNodeName\": \"施工调度系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 154, \"treeNodeId\": \"14564\", \"treeParentNodeId\": \"14481\", \"treeNodeName\": \"综合服务开通系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3014, \"treeNodeId\": \"14565\", \"treeParentNodeId\": \"14481\", \"treeNodeName\": \"综合激活及测试系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 183, \"treeNodeId\": \"14566\", \"treeParentNodeId\": \"14481\", \"treeNodeName\": \"信息发布系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3013, \"treeNodeId\": \"14580\", \"treeParentNodeId\": \"14481\", \"treeNodeName\": \"IOM\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 156, \"treeNodeId\": \"14584\", \"treeParentNodeId\": \"14481\", \"treeNodeName\": \"综合资源管理系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 161, \"treeNodeId\": \"14585\", \"treeParentNodeId\": \"14481\", \"treeNodeName\": \"专业网络管理系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"14491\", \"treeParentNodeId\": \"592\", \"treeNodeName\": \"BSS-计费\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 149, \"treeNodeId\": \"14492\", \"treeParentNodeId\": \"14491\", \"treeNodeName\": \"计费帐务系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3011, \"treeNodeId\": \"14537\", \"treeParentNodeId\": \"14491\", \"treeNodeName\": \"销账系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3101, \"treeNodeId\": \"14538\", \"treeParentNodeId\": \"14491\", \"treeNodeName\": \"共享信息平台\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3007, \"treeNodeId\": \"14545\", \"treeParentNodeId\": \"14491\", \"treeNodeName\": \"统一充值平台\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3001, \"treeNodeId\": \"14546\", \"treeParentNodeId\": \"14491\", \"treeNodeName\": \"综合采集系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3009, \"treeNodeId\": \"14547\", \"treeParentNodeId\": \"14491\", \"treeNodeName\": \"智能交换平台\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3002, \"treeNodeId\": \"14551\", \"treeParentNodeId\": \"14491\", \"treeNodeName\": \"融合计费系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3602, \"treeNodeId\": \"14560\", \"treeParentNodeId\": \"14491\", \"treeNodeName\": \"计费结算数据分析系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3102, \"treeNodeId\": \"14561\", \"treeParentNodeId\": \"14491\", \"treeNodeName\": \"佣金结算系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3003, \"treeNodeId\": \"14568\", \"treeParentNodeId\": \"14491\", \"treeNodeName\": \"在线计费系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3031, \"treeNodeId\": \"14569\", \"treeParentNodeId\": \"14491\", \"treeNodeName\": \"省级综合结算\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 196, \"treeNodeId\": \"14570\", \"treeParentNodeId\": \"14491\", \"treeNodeName\": \"余额管理中心系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 197, \"treeNodeId\": \"14571\", \"treeParentNodeId\": \"14491\", \"treeNodeName\": \"业务网关系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3005, \"treeNodeId\": \"14582\", \"treeParentNodeId\": \"14491\", \"treeNodeName\": \"综合结算分析系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"14506\", \"treeParentNodeId\": \"592\", \"treeNodeName\": \"MSS\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 165, \"treeNodeId\": \"14586\", \"treeParentNodeId\": \"14506\", \"treeNodeName\": \"工程管理系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3201, \"treeNodeId\": \"14587\", \"treeParentNodeId\": \"14506\", \"treeNodeName\": \"互联互通收入\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 190, \"treeNodeId\": \"14588\", \"treeParentNodeId\": \"14506\", \"treeNodeName\": \"自动终端\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 162, \"treeNodeId\": \"14624\", \"treeParentNodeId\": \"14506\", \"treeNodeName\": \"OA/企业内部门户\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 193, \"treeNodeId\": \"14625\", \"treeParentNodeId\": \"14506\", \"treeNodeName\": \"短厅系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 191, \"treeNodeId\": \"14657\", \"treeParentNodeId\": \"14506\", \"treeNodeName\": \"计划建设系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 163, \"treeNodeId\": \"14670\", \"treeParentNodeId\": \"14506\", \"treeNodeName\": \"财务管理专业系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 167, \"treeNodeId\": \"14671\", \"treeParentNodeId\": \"14506\", \"treeNodeName\": \"企业管理共享服务平台\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3008, \"treeNodeId\": \"14672\", \"treeParentNodeId\": \"14506\", \"treeNodeName\": \"渠道系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3801, \"treeNodeId\": \"14673\", \"treeParentNodeId\": \"14506\", \"treeNodeName\": \"决策支持系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3032, \"treeNodeId\": \"14694\", \"treeParentNodeId\": \"14506\", \"treeNodeName\": \"人力资源管理专业系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 195, \"treeNodeId\": \"14695\", \"treeParentNodeId\": \"14506\", \"treeNodeName\": \"审计信息系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 164, \"treeNodeId\": \"14713\", \"treeParentNodeId\": \"14506\", \"treeNodeName\": \"采购管理系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"14507\", \"treeParentNodeId\": \"592\", \"treeNodeName\": \"EDA\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 187, \"treeNodeId\": \"14589\", \"treeParentNodeId\": \"14507\", \"treeNodeName\": \"客服调度系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 188, \"treeNodeId\": \"14590\", \"treeParentNodeId\": \"14507\", \"treeNodeName\": \"营销渠道支撑系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 186, \"treeNodeId\": \"14605\", \"treeParentNodeId\": \"14507\", \"treeNodeName\": \"积分管理系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3012, \"treeNodeId\": \"14658\", \"treeParentNodeId\": \"14507\", \"treeNodeName\": \"ODS\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 189, \"treeNodeId\": \"14659\", \"treeParentNodeId\": \"14507\", \"treeNodeName\": \"收入报表系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 168, \"treeNodeId\": \"14674\", \"treeParentNodeId\": \"14507\", \"treeNodeName\": \"企业数据应用门户\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 170, \"treeNodeId\": \"14714\", \"treeParentNodeId\": \"14507\", \"treeNodeName\": \"EDW\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3604, \"treeNodeId\": \"14715\", \"treeParentNodeId\": \"14507\", \"treeNodeName\": \"经营分析系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"14508\", \"treeParentNodeId\": \"592\", \"treeNodeName\": \"ITM\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 171, \"treeNodeId\": \"14606\", \"treeParentNodeId\": \"14508\", \"treeNodeName\": \"IT基础设施监控系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 4101, \"treeNodeId\": \"14626\", \"treeParentNodeId\": \"14508\", \"treeNodeName\": \"IT服务管理系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3006, \"treeNodeId\": \"14675\", \"treeParentNodeId\": \"14508\", \"treeNodeName\": \"计费网管系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 172, \"treeNodeId\": \"14696\", \"treeParentNodeId\": \"14508\", \"treeNodeName\": \"应用软件监控系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 173, \"treeNodeId\": \"14697\", \"treeParentNodeId\": \"14508\", \"treeNodeName\": \"业务数据监控系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 100000000, \"treeNodeId\": \"15084\", \"treeParentNodeId\": \"14508\", \"treeNodeName\": \"张烨test\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"14509\", \"treeParentNodeId\": \"592\", \"treeNodeName\": \"BSS-CRM\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 194, \"treeNodeId\": \"14591\", \"treeParentNodeId\": \"14509\", \"treeNodeName\": \"VSOP系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3004, \"treeNodeId\": \"14607\", \"treeParentNodeId\": \"14509\", \"treeNodeName\": \"客户关系管理与营销服务支撑系统(CRM)\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 182, \"treeNodeId\": \"14608\", \"treeParentNodeId\": \"14509\", \"treeNodeName\": \"ESB系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 147, \"treeNodeId\": \"14640\", \"treeParentNodeId\": \"14509\", \"treeNodeName\": \"CRM类系统门户\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 148, \"treeNodeId\": \"14641\", \"treeParentNodeId\": \"14509\", \"treeNodeName\": \"统一接入管理系统(UAM)\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 185, \"treeNodeId\": \"14642\", \"treeParentNodeId\": \"14509\", \"treeNodeName\": \"短信渠道\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3046, \"treeNodeId\": \"14660\", \"treeParentNodeId\": \"14509\", \"treeNodeName\": \"10000多媒体客服平台\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3052, \"treeNodeId\": \"14698\", \"treeParentNodeId\": \"14509\", \"treeNodeName\": \"OOCP系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 192, \"treeNodeId\": \"14699\", \"treeParentNodeId\": \"14509\", \"treeNodeName\": \"外呼系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 3010, \"treeNodeId\": \"14700\", \"treeParentNodeId\": \"14509\", \"treeNodeName\": \"前台收费\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 181, \"treeNodeId\": \"14716\", \"treeParentNodeId\": \"14509\", \"treeNodeName\": \"EAI系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900009201, \"treeNodeId\": \"15489\", \"treeParentNodeId\": \"14509\", \"treeNodeName\": \"集团物联网系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900009202, \"treeNodeId\": \"15502\", \"treeParentNodeId\": \"14509\", \"treeNodeName\": \"集团UAM系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900009204, \"treeNodeId\": \"15503\", \"treeParentNodeId\": \"14509\", \"treeNodeName\": \"电信网络管理系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900009205, \"treeNodeId\": \"15504\", \"treeParentNodeId\": \"14509\", \"treeNodeName\": \"电信运营管理系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900009206, \"treeNodeId\": \"15505\", \"treeParentNodeId\": \"14509\", \"treeNodeName\": \"数据采集系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 900009203, \"treeNodeId\": \"15506\", \"treeParentNodeId\": \"14509\", \"treeNodeName\": \"集团OA系统\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"14510\", \"treeParentNodeId\": \"592\", \"treeNodeName\": \"其他域\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 900001206, \"treeNodeId\": \"612\", \"treeParentNodeId\": \"100\", \"treeNodeName\": \"链路\", \"sLevel\": \"2\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"1012\", \"treeParentNodeId\": \"100\", \"treeNodeName\": \"配置管理\", \"sLevel\": \"2\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"1013\", \"treeParentNodeId\": \"1012\", \"treeNodeName\": \"硬件资源\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"1014\", \"treeParentNodeId\": \"1013\", \"treeNodeName\": \"虚拟硬件资源\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"1015\", \"treeParentNodeId\": \"1014\", \"treeNodeName\": \"虚拟硬件模块\", \"sLevel\": \"5\"}, {\"instanceId\": 0, \"classId\": 900001012, \"treeNodeId\": \"1016\", \"treeParentNodeId\": \"1015\", \"treeNodeName\": \"虚拟存储设备\", \"sLevel\": \"6\"}, {\"instanceId\": 0, \"classId\": 900001013, \"treeNodeId\": \"1017\", \"treeParentNodeId\": \"1014\", \"treeNodeName\": \"虚拟存储路径\", \"sLevel\": \"5\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"17492\", \"treeParentNodeId\": \"1013\", \"treeNodeName\": \"存储设备\", \"sLevel\": \"4\"}, {\"instanceId\": 0, \"classId\": 100000001, \"treeNodeId\": \"17493\", \"treeParentNodeId\": \"17492\", \"treeNodeName\": \"存储设备\", \"sLevel\": \"5\"}, {\"instanceId\": 0, \"classId\": 0, \"treeNodeId\": \"1220\", \"treeParentNodeId\": \"100\", \"treeNodeName\": \"网络链路\", \"sLevel\": \"2\"}, {\"instanceId\": 0, \"classId\": 1142, \"treeNodeId\": \"1221\", \"treeParentNodeId\": \"1220\", \"treeNodeName\": \"聚合链路\", \"sLevel\": \"3\"}, {\"instanceId\": 0, \"classId\": 1140, \"treeNodeId\": \"1224\", \"treeParentNodeId\": \"1220\", \"treeNodeName\": \"数据链路\", \"sLevel\": \"3\"}]";
        // JSONObject object = JSONObject.parseObject(json);
        // System.out.println(object);
    }
    
    @Test
    public void testList() {
		String[] arrays = {"1", "2", "3"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arrays));
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if(str.equals("1")) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }



}


