cd aula-ci
sudo apt-get install mailutils
echo "Sending e-mail after pipeline completion" | mail -s "Pipeline" leandro.teixeira@gec.inatel.br
