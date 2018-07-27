import { Personagem } from './personagem';
import { Pessoa } from './pessoa';

export class Membro extends Pessoa {
   
    private _apelido : string;
    private _personagens : Array<Personagem> = [];

    getApelido () : string {
        return this._apelido;
    }
    
    setApelido (_apelido : string) : void {
        this._apelido = _apelido;
    }

    public getPersonagens () : Array<Personagem> {
        return this._personagens;
    }

    public setPersonagens (personagens : Array<Personagem>) : void {
        this._personagens = personagens;
    }
}
