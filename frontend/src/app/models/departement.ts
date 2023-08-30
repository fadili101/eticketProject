import { User } from "./user";

export interface Departement {
    departement_id: number;
    departement: string;
    type: string;
    parent: Departement | null;
    children: Departement[];
    userSet: User[];
}