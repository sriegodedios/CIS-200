using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calculator
{
    public partial class Calculator : Form
    {
        private Button[] buttons;
        private int count = 0; 

       
        public Calculator()
        {
            
            InitializeComponent();
            
            buttons = new Button[10];
            buttons[0] = button0;
            buttons[1] = button1;
            buttons[2] = button2;
            buttons[3] = button3;
            buttons[4] = button4;
            buttons[5] = button5;
            buttons[6] = button6;
            buttons[7] = button7;
            buttons[8] = button8;
            buttons[9] = button9;
            for (int i = 0; i < buttons.Length; i++)
            {
                buttons[i].Click += new EventHandler(buttonClick);


            }

            clearButton.Click += new EventHandler(clearBox);

        }


        private void boxFull()
        {
            if(count == 16)
            {
                for (int i = 0; i < buttons.Length; i++)
                {
                    buttons[i].Enabled = false;


                }
                

            }

           // if(answerBox.i)


        }



        private void buttonClick(object sender, EventArgs e)
        {
            boxFull();
            Button b = (Button)sender;
            answerBox.Text += b.Text;
            count++;

        }

        private void clearBox(object sender, EventArgs e)
        {
            answerBox.Text = "";
            for (int i = 0; i < buttons.Length; i++)
            {
                buttons[i].Enabled = true;


            }
            count = 0;

        }

       


       

        }
    }

