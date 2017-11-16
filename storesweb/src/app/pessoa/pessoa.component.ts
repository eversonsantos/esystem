import { Component, OnInit } from '@angular/core';
import { FormsModule} from '@angular/forms';
import {Pessoa} from '../model/pessoa';

@Component({
  selector: 'app-pessoa',
  templateUrl: './pessoa.component.html',
  styleUrls: ['./pessoa.component.css']
})
export class PessoaComponent implements OnInit {

  pessoa: Pessoa = new Pessoa();

  constructor() { }

  ngOnInit() {
  }

}
