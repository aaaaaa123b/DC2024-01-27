﻿using Publisher.Entity.Db;
using Publisher.Repository.Implementation.Common;
using Publisher.Repository.Interface;
using Publisher.Storage.Common;

namespace Publisher.Repository.Implementation
{
    public class stickerRepository(DbStorage context) : AbstractCrudRepository<sticker>(context), IstickerRepository
    {
    }
}
