import { Module } from '@nestjs/common';
import { TypeOrmModule } from '@nestjs/typeorm';
import { Author } from '../entities/Author';
import { AuthorService } from './author.service';
import { AuthorController } from './author.controller';

@Module({
    imports: [TypeOrmModule.forFeature([Author])],
    providers: [AuthorService],
    controllers: [AuthorController],
    exports: [TypeOrmModule]
})
export class AuthorModule {}
