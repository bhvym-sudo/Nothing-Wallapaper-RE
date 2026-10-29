.class public final Lz6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz6/b$a;,
        Lz6/b$b;,
        Lz6/b$c;,
        Lz6/b$d;
    }
.end annotation


# static fields
.field public static final L:Lz6/b$a;

.field public static final M:Ljava/lang/String;

.field public static final N:Ljava/lang/String;

.field public static final O:Ljava/lang/String;

.field public static final P:Ljava/lang/String;

.field public static final Q:Ljava/lang/String;

.field public static final R:J

.field public static final S:LE8/g;

.field public static final T:Ljava/lang/String;

.field public static final U:Ljava/lang/String;

.field public static final V:Ljava/lang/String;

.field public static final W:Ljava/lang/String;

.field public static final X:Ljava/lang/String;


# instance fields
.field private final A:Ljava/util/LinkedHashMap;

.field private B:I

.field private C:Z

.field private D:Z

.field private E:Z

.field private F:Z

.field private G:Z

.field private H:Z

.field private I:J

.field private final J:LT8/d;

.field private final K:Lz6/b$e;

.field private final q:LY8/a;

.field private final r:Ljava/io/File;

.field private final s:I

.field private final t:I

.field private u:J

.field private final v:Ljava/io/File;

.field private final w:Ljava/io/File;

.field private final x:Ljava/io/File;

.field private y:J

.field private z:Le9/f;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lz6/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz6/b$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lz6/b;->L:Lz6/b$a;

    const-string v0, "journal"

    sput-object v0, Lz6/b;->M:Ljava/lang/String;

    const-string v0, "journal.tmp"

    sput-object v0, Lz6/b;->N:Ljava/lang/String;

    const-string v0, "journal.bkp"

    sput-object v0, Lz6/b;->O:Ljava/lang/String;

    const-string v0, "libcore.io.DiskLruCache"

    sput-object v0, Lz6/b;->P:Ljava/lang/String;

    const-string v0, "1"

    sput-object v0, Lz6/b;->Q:Ljava/lang/String;

    const-wide/16 v0, -0x1

    sput-wide v0, Lz6/b;->R:J

    new-instance v0, LE8/g;

    const-string v1, "[a-z0-9_-]{1,120}"

    invoke-direct {v0, v1}, LE8/g;-><init>(Ljava/lang/String;)V

    sput-object v0, Lz6/b;->S:LE8/g;

    const-string v0, "CLEAN"

    sput-object v0, Lz6/b;->T:Ljava/lang/String;

    const-string v0, "DIRTY"

    sput-object v0, Lz6/b;->U:Ljava/lang/String;

    const-string v0, "REMOVE"

    sput-object v0, Lz6/b;->V:Ljava/lang/String;

    const-string v0, "READ"

    sput-object v0, Lz6/b;->W:Ljava/lang/String;

    const-string v0, "DisLruCache"

    sput-object v0, Lz6/b;->X:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(LY8/a;Ljava/io/File;IIJLT8/e;)V
    .registers 10

    const-string v0, "fileSystem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "directory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "taskRunner"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz6/b;->q:LY8/a;

    iput-object p2, p0, Lz6/b;->r:Ljava/io/File;

    iput p3, p0, Lz6/b;->s:I

    iput p4, p0, Lz6/b;->t:I

    iput-wide p5, p0, Lz6/b;->u:J

    new-instance p1, Ljava/util/LinkedHashMap;

    const/high16 p3, 0x3f400000    # 0.75f

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p1, v1, p3, v0}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object p1, p0, Lz6/b;->A:Ljava/util/LinkedHashMap;

    invoke-virtual {p7}, LT8/e;->i()LT8/d;

    move-result-object p1

    iput-object p1, p0, Lz6/b;->J:LT8/d;

    new-instance p1, Lz6/b$e;

    invoke-direct {p1, p0}, Lz6/b$e;-><init>(Lz6/b;)V

    iput-object p1, p0, Lz6/b;->K:Lz6/b$e;

    const-wide/16 v0, 0x0

    cmp-long p1, p5, v0

    if-lez p1, :cond_60

    if-lez p4, :cond_58

    new-instance p1, Ljava/io/File;

    sget-object p3, Lz6/b;->M:Ljava/lang/String;

    invoke-direct {p1, p2, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object p1, p0, Lz6/b;->v:Ljava/io/File;

    new-instance p1, Ljava/io/File;

    sget-object p3, Lz6/b;->N:Ljava/lang/String;

    invoke-direct {p1, p2, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object p1, p0, Lz6/b;->w:Ljava/io/File;

    new-instance p1, Ljava/io/File;

    sget-object p3, Lz6/b;->O:Ljava/lang/String;

    invoke-direct {p1, p2, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object p1, p0, Lz6/b;->x:Ljava/io/File;

    return-void

    :cond_58
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "valueCount <= 0"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_60
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "maxSize <= 0"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic B(Lz6/b;I)V
    .registers 2

    iput p1, p0, Lz6/b;->B:I

    return-void
.end method

.method private final declared-synchronized G()V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, Lz6/b;->F:Z
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_f

    if-nez v0, :cond_7

    monitor-exit p0

    return-void

    :cond_7
    :try_start_7
    const-string v0, "cache is closed"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_f
    move-exception v0

    monitor-exit p0
    :try_end_11
    .catchall {:try_start_7 .. :try_end_11} :catchall_f

    throw v0
.end method

.method private final I0()Z
    .registers 3

    iget v0, p0, Lz6/b;->B:I

    const/16 v1, 0x7d0

    if-lt v0, v1, :cond_10

    iget-object p0, p0, Lz6/b;->A:Ljava/util/LinkedHashMap;

    invoke-virtual {p0}, Ljava/util/AbstractMap;->size()I

    move-result p0

    if-lt v0, p0, :cond_10

    const/4 p0, 0x1

    return p0

    :cond_10
    const/4 p0, 0x0

    return p0
.end method

.method private final P0()Le9/f;
    .registers 4

    iget-object v0, p0, Lz6/b;->q:LY8/a;

    iget-object v1, p0, Lz6/b;->v:Ljava/io/File;

    invoke-interface {v0, v1}, LY8/a;->g(Ljava/io/File;)Le9/z;

    move-result-object v0

    new-instance v1, Lz6/d;

    new-instance v2, Lz6/a;

    invoke-direct {v2, p0}, Lz6/a;-><init>(Lz6/b;)V

    invoke-direct {v1, v0, v2}, Lz6/d;-><init>(Le9/z;Lv8/l;)V

    invoke-static {v1}, Le9/o;->c(Le9/z;)Le9/f;

    move-result-object p0

    return-object p0
.end method

.method private static final T0(Lz6/b;Ljava/io/IOException;)Lh8/A;
    .registers 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lz6/b;->C:Z

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static synthetic U(Lz6/b;Ljava/lang/String;JILjava/lang/Object;)Lz6/b$b;
    .registers 6

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_6

    sget-wide p2, Lz6/b;->R:J

    :cond_6
    invoke-virtual {p0, p1, p2, p3}, Lz6/b;->Q(Ljava/lang/String;J)Lz6/b$b;

    move-result-object p0

    return-object p0
.end method

.method private final U0()V
    .registers 9

    iget-object v0, p0, Lz6/b;->q:LY8/a;

    iget-object v1, p0, Lz6/b;->w:Ljava/io/File;

    invoke-interface {v0, v1}, LY8/a;->f(Ljava/io/File;)V

    iget-object v0, p0, Lz6/b;->A:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_11
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_68

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "next(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lz6/b$c;

    invoke-virtual {v1}, Lz6/b$c;->b()Lz6/b$b;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_3b

    iget v2, p0, Lz6/b;->t:I

    :goto_2b
    if-ge v3, v2, :cond_11

    iget-wide v4, p0, Lz6/b;->y:J

    invoke-virtual {v1}, Lz6/b$c;->e()[J

    move-result-object v6

    aget-wide v6, v6, v3

    add-long/2addr v4, v6

    iput-wide v4, p0, Lz6/b;->y:J

    add-int/lit8 v3, v3, 0x1

    goto :goto_2b

    :cond_3b
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lz6/b$c;->l(Lz6/b$b;)V

    iget v2, p0, Lz6/b;->t:I

    :goto_41
    if-ge v3, v2, :cond_64

    iget-object v4, p0, Lz6/b;->q:LY8/a;

    invoke-virtual {v1}, Lz6/b$c;->a()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/io/File;

    invoke-interface {v4, v5}, LY8/a;->f(Ljava/io/File;)V

    iget-object v4, p0, Lz6/b;->q:LY8/a;

    invoke-virtual {v1}, Lz6/b$c;->c()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/io/File;

    invoke-interface {v4, v5}, LY8/a;->f(Ljava/io/File;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_41

    :cond_64
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_11

    :cond_68
    return-void
.end method

.method private final W0()V
    .registers 9

    const-string v0, ", "

    iget-object v1, p0, Lz6/b;->q:LY8/a;

    iget-object v2, p0, Lz6/b;->v:Ljava/io/File;

    invoke-interface {v1, v2}, LY8/a;->a(Ljava/io/File;)Le9/B;

    move-result-object v1

    invoke-static {v1}, Le9/o;->d(Le9/B;)Le9/g;

    move-result-object v1

    :try_start_e
    invoke-interface {v1}, Le9/g;->z0()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Le9/g;->z0()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1}, Le9/g;->z0()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1}, Le9/g;->z0()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1}, Le9/g;->z0()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lz6/b;->P:Ljava/lang/String;

    invoke-static {v7, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7d

    sget-object v7, Lz6/b;->Q:Ljava/lang/String;

    invoke-static {v7, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7d

    iget v7, p0, Lz6/b;->s:I

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7d

    iget v4, p0, Lz6/b;->t:I

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7d

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v4
    :try_end_4e
    .catchall {:try_start_e .. :try_end_4e} :catchall_5b

    if-gtz v4, :cond_7d

    const/4 v0, 0x0

    :goto_51
    :try_start_51
    invoke-interface {v1}, Le9/g;->z0()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lz6/b;->X0(Ljava/lang/String;)V
    :try_end_58
    .catch Ljava/io/EOFException; {:try_start_51 .. :try_end_58} :catch_5d
    .catchall {:try_start_51 .. :try_end_58} :catchall_5b

    add-int/lit8 v0, v0, 0x1

    goto :goto_51

    :catchall_5b
    move-exception p0

    goto :goto_ab

    :catch_5d
    :try_start_5d
    iget-object v2, p0, Lz6/b;->A:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/AbstractMap;->size()I

    move-result v2

    sub-int/2addr v0, v2

    iput v0, p0, Lz6/b;->B:I

    invoke-interface {v1}, Le9/g;->D()Z

    move-result v0

    if-nez v0, :cond_70

    invoke-virtual {p0}, Lz6/b;->c1()V

    goto :goto_76

    :cond_70
    invoke-direct {p0}, Lz6/b;->P0()Le9/f;

    move-result-object v0

    iput-object v0, p0, Lz6/b;->z:Le9/f;

    :goto_76
    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_78
    .catchall {:try_start_5d .. :try_end_78} :catchall_5b

    const/4 p0, 0x0

    invoke-static {v1, p0}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-void

    :cond_7d
    :try_start_7d
    new-instance p0, Ljava/io/IOException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "unexpected journal header: ["

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_ab
    .catchall {:try_start_7d .. :try_end_ab} :catchall_5b

    :goto_ab
    :try_start_ab
    throw p0
    :try_end_ac
    .catchall {:try_start_ab .. :try_end_ac} :catchall_ac

    :catchall_ac
    move-exception v0

    invoke-static {v1, p0}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private final X0(Ljava/lang/String;)V
    .registers 21

    move-object/from16 v0, p0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/16 v2, 0x20

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v6}, LE8/i;->c0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v9

    const-string v10, "unexpected journal line: "

    const/4 v11, -0x1

    if-eq v9, v11, :cond_cf

    add-int/lit8 v3, v9, 0x1

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v2, 0x20

    const/4 v4, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v6}, LE8/i;->c0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v2

    const-string v4, "substring(...)"

    const/4 v5, 0x2

    if-ne v2, v11, :cond_42

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v12, Lz6/b;->V:Ljava/lang/String;

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v13

    if-ne v9, v13, :cond_49

    invoke-static {v1, v12, v7, v5, v6}, LE8/i;->M(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_49

    iget-object v0, v0, Lz6/b;->A:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v3}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_42
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_49
    iget-object v12, v0, Lz6/b;->A:Ljava/util/LinkedHashMap;

    invoke-virtual {v12, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lz6/b$c;

    if-nez v12, :cond_5d

    new-instance v12, Lz6/b$c;

    invoke-direct {v12, v0, v3}, Lz6/b$c;-><init>(Lz6/b;Ljava/lang/String;)V

    iget-object v13, v0, Lz6/b;->A:Ljava/util/LinkedHashMap;

    invoke-interface {v13, v3, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5d
    if-eq v2, v11, :cond_90

    sget-object v3, Lz6/b;->T:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v13

    if-ne v9, v13, :cond_90

    invoke-static {v1, v3, v7, v5, v6}, LE8/i;->M(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_90

    add-int/2addr v2, v8

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v14, v8, [C

    const/16 v0, 0x20

    aput-char v0, v14, v7

    const/16 v17, 0x6

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, LE8/i;->C0(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v12, v8}, Lz6/b$c;->o(Z)V

    invoke-virtual {v12, v6}, Lz6/b$c;->l(Lz6/b$b;)V

    invoke-virtual {v12, v0}, Lz6/b$c;->m(Ljava/util/List;)V

    return-void

    :cond_90
    if-ne v2, v11, :cond_a9

    sget-object v3, Lz6/b;->U:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-ne v9, v4, :cond_a9

    invoke-static {v1, v3, v7, v5, v6}, LE8/i;->M(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a9

    new-instance v1, Lz6/b$b;

    invoke-direct {v1, v0, v12}, Lz6/b$b;-><init>(Lz6/b;Lz6/b$c;)V

    invoke-virtual {v12, v1}, Lz6/b$c;->l(Lz6/b$b;)V

    return-void

    :cond_a9
    if-ne v2, v11, :cond_ba

    sget-object v0, Lz6/b;->W:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-ne v9, v2, :cond_ba

    invoke-static {v1, v0, v7, v5, v6}, LE8/i;->M(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_ba

    return-void

    :cond_ba
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_cf
    move-object/from16 v1, p1

    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic a(Lz6/b;Ljava/io/IOException;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lz6/b;->T0(Lz6/b;Ljava/io/IOException;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lz6/b;)Z
    .registers 1

    iget-boolean p0, p0, Lz6/b;->D:Z

    return p0
.end method

.method public static final synthetic f(Lz6/b;)Z
    .registers 1

    iget-boolean p0, p0, Lz6/b;->E:Z

    return p0
.end method

.method public static final synthetic g(Lz6/b;)Z
    .registers 1

    invoke-direct {p0}, Lz6/b;->I0()Z

    move-result p0

    return p0
.end method

.method private final h1()Z
    .registers 4

    iget-object v0, p0, Lz6/b;->A:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_26

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "next(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lz6/b$c;

    invoke-virtual {v1}, Lz6/b$c;->i()Z

    move-result v2

    if-nez v2, :cond_a

    invoke-virtual {p0, v1}, Lz6/b;->g1(Lz6/b$c;)Z

    const/4 p0, 0x1

    return p0

    :cond_26
    const/4 p0, 0x0

    return p0
.end method

.method public static final synthetic j(Lz6/b;Le9/f;)V
    .registers 2

    iput-object p1, p0, Lz6/b;->z:Le9/f;

    return-void
.end method

.method private final j1(Ljava/lang/String;)V
    .registers 3

    sget-object p0, Lz6/b;->S:LE8/g;

    invoke-virtual {p0, p1}, LE8/g;->a(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_9

    return-void

    :cond_9
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "keys must match regex [a-z0-9_-]{1,120}: \""

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\""

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic u(Lz6/b;Z)V
    .registers 2

    iput-boolean p1, p0, Lz6/b;->H:Z

    return-void
.end method

.method public static final synthetic z(Lz6/b;Z)V
    .registers 2

    iput-boolean p1, p0, Lz6/b;->G:Z

    return-void
.end method


# virtual methods
.method public final A0()I
    .registers 1

    iget p0, p0, Lz6/b;->t:I

    return p0
.end method

.method public final declared-synchronized B0()V
    .registers 7

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, Lz6/b;->E:Z
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_23

    if-eqz v0, :cond_7

    monitor-exit p0

    return-void

    :cond_7
    :try_start_7
    iget-object v0, p0, Lz6/b;->q:LY8/a;

    iget-object v1, p0, Lz6/b;->x:Ljava/io/File;

    invoke-interface {v0, v1}, LY8/a;->d(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_2e

    iget-object v0, p0, Lz6/b;->q:LY8/a;

    iget-object v1, p0, Lz6/b;->v:Ljava/io/File;

    invoke-interface {v0, v1}, LY8/a;->d(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_25

    iget-object v0, p0, Lz6/b;->q:LY8/a;

    iget-object v1, p0, Lz6/b;->x:Ljava/io/File;

    invoke-interface {v0, v1}, LY8/a;->f(Ljava/io/File;)V

    goto :goto_2e

    :catchall_23
    move-exception v0

    goto :goto_89

    :cond_25
    iget-object v0, p0, Lz6/b;->q:LY8/a;

    iget-object v1, p0, Lz6/b;->x:Ljava/io/File;

    iget-object v2, p0, Lz6/b;->v:Ljava/io/File;

    invoke-interface {v0, v1, v2}, LY8/a;->e(Ljava/io/File;Ljava/io/File;)V

    :cond_2e
    :goto_2e
    iget-object v0, p0, Lz6/b;->q:LY8/a;

    iget-object v1, p0, Lz6/b;->x:Ljava/io/File;

    invoke-static {v0, v1}, Lz6/e;->a(LY8/a;Ljava/io/File;)Z

    move-result v0

    iput-boolean v0, p0, Lz6/b;->D:Z

    iget-object v0, p0, Lz6/b;->q:LY8/a;

    iget-object v1, p0, Lz6/b;->v:Ljava/io/File;

    invoke-interface {v0, v1}, LY8/a;->d(Ljava/io/File;)Z

    move-result v0
    :try_end_40
    .catchall {:try_start_7 .. :try_end_40} :catchall_23

    const/4 v1, 0x1

    if-eqz v0, :cond_82

    :try_start_43
    invoke-direct {p0}, Lz6/b;->W0()V

    invoke-direct {p0}, Lz6/b;->U0()V

    iput-boolean v1, p0, Lz6/b;->E:Z
    :try_end_4b
    .catch Ljava/io/IOException; {:try_start_43 .. :try_end_4b} :catch_4d
    .catchall {:try_start_43 .. :try_end_4b} :catchall_23

    monitor-exit p0

    return-void

    :catch_4d
    move-exception v0

    :try_start_4e
    sget-object v2, Lz6/b;->X:Ljava/lang/String;

    iget-object v3, p0, Lz6/b;->r:Ljava/io/File;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "DiskLruCache "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " is corrupt: "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", removing"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_77
    .catchall {:try_start_4e .. :try_end_77} :catchall_23

    const/4 v0, 0x0

    :try_start_78
    invoke-virtual {p0}, Lz6/b;->K()V
    :try_end_7b
    .catchall {:try_start_78 .. :try_end_7b} :catchall_7e

    :try_start_7b
    iput-boolean v0, p0, Lz6/b;->F:Z

    goto :goto_82

    :catchall_7e
    move-exception v1

    iput-boolean v0, p0, Lz6/b;->F:Z

    throw v1

    :cond_82
    :goto_82
    invoke-virtual {p0}, Lz6/b;->c1()V

    iput-boolean v1, p0, Lz6/b;->E:Z
    :try_end_87
    .catchall {:try_start_7b .. :try_end_87} :catchall_23

    monitor-exit p0

    return-void

    :goto_89
    :try_start_89
    monitor-exit p0
    :try_end_8a
    .catchall {:try_start_89 .. :try_end_8a} :catchall_23

    throw v0
.end method

.method public final declared-synchronized I(Lz6/b$b;Z)V
    .registers 11

    monitor-enter p0

    :try_start_1
    const-string v0, "editor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lz6/b$b;->e()Lz6/b$c;

    move-result-object v0

    invoke-virtual {v0}, Lz6/b$c;->b()Lz6/b$b;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13a

    const/4 v1, 0x0

    if-eqz p2, :cond_65

    invoke-virtual {v0}, Lz6/b$c;->g()Z

    move-result v2

    if-nez v2, :cond_65

    iget v2, p0, Lz6/b;->t:I

    move v3, v1

    :goto_20
    if-ge v3, v2, :cond_65

    invoke-virtual {p1}, Lz6/b$b;->f()[Z

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    aget-boolean v4, v4, v3

    if-eqz v4, :cond_4b

    iget-object v4, p0, Lz6/b;->q:LY8/a;

    invoke-virtual {v0}, Lz6/b$c;->c()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/io/File;

    invoke-interface {v4, v5}, LY8/a;->d(Ljava/io/File;)Z

    move-result v4

    if-nez v4, :cond_48

    invoke-virtual {p1}, Lz6/b$b;->b()V
    :try_end_42
    .catchall {:try_start_1 .. :try_end_42} :catchall_44

    monitor-exit p0

    return-void

    :catchall_44
    move-exception v0

    move-object p1, v0

    goto/16 :goto_142

    :cond_48
    add-int/lit8 v3, v3, 0x1

    goto :goto_20

    :cond_4b
    :try_start_4b
    invoke-virtual {p1}, Lz6/b$b;->b()V

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Newly created entry didn\'t create value for index "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_65
    iget p1, p0, Lz6/b;->t:I

    :goto_67
    if-ge v1, p1, :cond_b3

    invoke-virtual {v0}, Lz6/b$c;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    if-eqz p2, :cond_ab

    invoke-virtual {v0}, Lz6/b$c;->i()Z

    move-result v3

    if-nez v3, :cond_ab

    iget-object v3, p0, Lz6/b;->q:LY8/a;

    invoke-interface {v3, v2}, LY8/a;->d(Ljava/io/File;)Z

    move-result v3

    if-eqz v3, :cond_b0

    invoke-virtual {v0}, Lz6/b$c;->a()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/io/File;

    iget-object v4, p0, Lz6/b;->q:LY8/a;

    invoke-interface {v4, v2, v3}, LY8/a;->e(Ljava/io/File;Ljava/io/File;)V

    invoke-virtual {v0}, Lz6/b$c;->e()[J

    move-result-object v2

    aget-wide v4, v2, v1

    iget-object v2, p0, Lz6/b;->q:LY8/a;

    invoke-interface {v2, v3}, LY8/a;->h(Ljava/io/File;)J

    move-result-wide v2

    invoke-virtual {v0}, Lz6/b$c;->e()[J

    move-result-object v6

    aput-wide v2, v6, v1

    iget-wide v6, p0, Lz6/b;->y:J

    sub-long/2addr v6, v4

    add-long/2addr v6, v2

    iput-wide v6, p0, Lz6/b;->y:J

    goto :goto_b0

    :cond_ab
    iget-object v3, p0, Lz6/b;->q:LY8/a;

    invoke-interface {v3, v2}, LY8/a;->f(Ljava/io/File;)V

    :cond_b0
    :goto_b0
    add-int/lit8 v1, v1, 0x1

    goto :goto_67

    :cond_b3
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lz6/b$c;->l(Lz6/b$b;)V

    invoke-virtual {v0}, Lz6/b$c;->i()Z

    move-result p1

    if-eqz p1, :cond_c2

    invoke-virtual {p0, v0}, Lz6/b;->g1(Lz6/b$c;)Z
    :try_end_c0
    .catchall {:try_start_4b .. :try_end_c0} :catchall_44

    monitor-exit p0

    return-void

    :cond_c2
    :try_start_c2
    iget p1, p0, Lz6/b;->B:I

    const/4 v1, 0x1

    add-int/2addr p1, v1

    iput p1, p0, Lz6/b;->B:I

    iget-object p1, p0, Lz6/b;->z:Le9/f;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lz6/b$c;->g()Z

    move-result v2

    const/16 v3, 0xa

    const/16 v4, 0x20

    if-nez v2, :cond_f7

    if-eqz p2, :cond_da

    goto :goto_f7

    :cond_da
    iget-object p2, p0, Lz6/b;->A:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Lz6/b$c;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p2, Lz6/b;->V:Ljava/lang/String;

    invoke-interface {p1, p2}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    move-result-object p2

    invoke-interface {p2, v4}, Le9/f;->F(I)Le9/f;

    invoke-virtual {v0}, Lz6/b$c;->d()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    invoke-interface {p1, v3}, Le9/f;->F(I)Le9/f;

    goto :goto_11c

    :cond_f7
    :goto_f7
    invoke-virtual {v0, v1}, Lz6/b$c;->o(Z)V

    sget-object v1, Lz6/b;->T:Ljava/lang/String;

    invoke-interface {p1, v1}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    move-result-object v1

    invoke-interface {v1, v4}, Le9/f;->F(I)Le9/f;

    invoke-virtual {v0}, Lz6/b$c;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    invoke-virtual {v0, p1}, Lz6/b$c;->s(Le9/f;)V

    invoke-interface {p1, v3}, Le9/f;->F(I)Le9/f;

    if-eqz p2, :cond_11c

    iget-wide v1, p0, Lz6/b;->I:J

    const-wide/16 v3, 0x1

    add-long/2addr v3, v1

    iput-wide v3, p0, Lz6/b;->I:J

    invoke-virtual {v0, v1, v2}, Lz6/b$c;->p(J)V

    :cond_11c
    :goto_11c
    invoke-interface {p1}, Le9/f;->flush()V

    iget-wide p1, p0, Lz6/b;->y:J

    iget-wide v0, p0, Lz6/b;->u:J

    cmp-long p1, p1, v0

    if-gtz p1, :cond_12d

    invoke-direct {p0}, Lz6/b;->I0()Z

    move-result p1

    if-eqz p1, :cond_138

    :cond_12d
    iget-object v0, p0, Lz6/b;->J:LT8/d;

    iget-object v1, p0, Lz6/b;->K:Lz6/b$e;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, LT8/d;->j(LT8/d;LT8/a;JILjava/lang/Object;)V
    :try_end_138
    .catchall {:try_start_c2 .. :try_end_138} :catchall_44

    :cond_138
    monitor-exit p0

    return-void

    :cond_13a
    :try_start_13a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Check failed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_142
    monitor-exit p0
    :try_end_143
    .catchall {:try_start_13a .. :try_end_143} :catchall_44

    throw p1
.end method

.method public final K()V
    .registers 2

    invoke-virtual {p0}, Lz6/b;->close()V

    iget-object v0, p0, Lz6/b;->q:LY8/a;

    iget-object p0, p0, Lz6/b;->r:Ljava/io/File;

    invoke-interface {v0, p0}, LY8/a;->c(Ljava/io/File;)V

    return-void
.end method

.method public final declared-synchronized O0()Ljava/util/List;
    .registers 4

    monitor-enter p0

    :try_start_1
    invoke-virtual {p0}, Lz6/b;->B0()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lz6/b;->A:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    const-string v2, "<get-keys>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_19
    .catchall {:try_start_1 .. :try_end_19} :catchall_1b

    monitor-exit p0

    return-object v0

    :catchall_1b
    move-exception v0

    :try_start_1c
    monitor-exit p0
    :try_end_1d
    .catchall {:try_start_1c .. :try_end_1d} :catchall_1b

    throw v0
.end method

.method public final declared-synchronized Q(Ljava/lang/String;J)Lz6/b$b;
    .registers 13

    monitor-enter p0

    :try_start_1
    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lz6/b;->B0()V

    invoke-direct {p0}, Lz6/b;->G()V

    invoke-direct {p0, p1}, Lz6/b;->j1(Ljava/lang/String;)V

    iget-object v0, p0, Lz6/b;->A:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz6/b$c;

    sget-wide v1, Lz6/b;->R:J

    cmp-long v1, p2, v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2e

    if-eqz v0, :cond_2c

    invoke-virtual {v0}, Lz6/b$c;->h()J

    move-result-wide v3
    :try_end_24
    .catchall {:try_start_1 .. :try_end_24} :catchall_29

    cmp-long p2, v3, p2

    if-eqz p2, :cond_2e

    goto :goto_2c

    :catchall_29
    move-exception v0

    move-object p1, v0

    goto :goto_93

    :cond_2c
    :goto_2c
    monitor-exit p0

    return-object v2

    :cond_2e
    if-eqz v0, :cond_35

    :try_start_30
    invoke-virtual {v0}, Lz6/b$c;->b()Lz6/b$b;

    move-result-object p2
    :try_end_34
    .catchall {:try_start_30 .. :try_end_34} :catchall_29

    goto :goto_36

    :cond_35
    move-object p2, v2

    :goto_36
    if-eqz p2, :cond_3a

    monitor-exit p0

    return-object v2

    :cond_3a
    if-eqz v0, :cond_44

    :try_start_3c
    invoke-virtual {v0}, Lz6/b$c;->f()I

    move-result p2
    :try_end_40
    .catchall {:try_start_3c .. :try_end_40} :catchall_29

    if-eqz p2, :cond_44

    monitor-exit p0

    return-object v2

    :cond_44
    :try_start_44
    iget-boolean p2, p0, Lz6/b;->G:Z

    if-nez p2, :cond_86

    iget-boolean p2, p0, Lz6/b;->H:Z

    if-eqz p2, :cond_4d

    goto :goto_86

    :cond_4d
    iget-object p2, p0, Lz6/b;->z:Le9/f;

    invoke-static {p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    sget-object p3, Lz6/b;->U:Ljava/lang/String;

    invoke-interface {p2, p3}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    move-result-object p3

    const/16 v1, 0x20

    invoke-interface {p3, v1}, Le9/f;->F(I)Le9/f;

    move-result-object p3

    invoke-interface {p3, p1}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    move-result-object p3

    const/16 v1, 0xa

    invoke-interface {p3, v1}, Le9/f;->F(I)Le9/f;

    invoke-interface {p2}, Le9/f;->flush()V

    iget-boolean p2, p0, Lz6/b;->C:Z
    :try_end_6c
    .catchall {:try_start_44 .. :try_end_6c} :catchall_29

    if-eqz p2, :cond_70

    monitor-exit p0

    return-object v2

    :cond_70
    if-nez v0, :cond_7c

    :try_start_72
    new-instance v0, Lz6/b$c;

    invoke-direct {v0, p0, p1}, Lz6/b$c;-><init>(Lz6/b;Ljava/lang/String;)V

    iget-object p2, p0, Lz6/b;->A:Ljava/util/LinkedHashMap;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7c
    new-instance p1, Lz6/b$b;

    invoke-direct {p1, p0, v0}, Lz6/b$b;-><init>(Lz6/b;Lz6/b$c;)V

    invoke-virtual {v0, p1}, Lz6/b$c;->l(Lz6/b$b;)V
    :try_end_84
    .catchall {:try_start_72 .. :try_end_84} :catchall_29

    monitor-exit p0

    return-object p1

    :cond_86
    :goto_86
    :try_start_86
    iget-object v3, p0, Lz6/b;->J:LT8/d;

    iget-object v4, p0, Lz6/b;->K:Lz6/b$e;

    const/4 v7, 0x2

    const/4 v8, 0x0

    const-wide/16 v5, 0x0

    invoke-static/range {v3 .. v8}, LT8/d;->j(LT8/d;LT8/a;JILjava/lang/Object;)V
    :try_end_91
    .catchall {:try_start_86 .. :try_end_91} :catchall_29

    monitor-exit p0

    return-object v2

    :goto_93
    :try_start_93
    monitor-exit p0
    :try_end_94
    .catchall {:try_start_93 .. :try_end_94} :catchall_29

    throw p1
.end method

.method public final declared-synchronized Y(Ljava/util/List;)V
    .registers 8

    monitor-enter p0

    :try_start_1
    invoke-virtual {p0}, Lz6/b;->B0()V

    iget-object v0, p0, Lz6/b;->A:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    new-array v2, v1, [Lz6/b$c;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz6/b$c;

    array-length v2, v0

    move v3, v1

    :goto_1a
    if-ge v3, v2, :cond_36

    aget-object v4, v0, v3

    invoke-static {v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    if-eqz p1, :cond_30

    invoke-virtual {v4}, Lz6/b$c;->d()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_33

    goto :goto_30

    :catchall_2e
    move-exception p1

    goto :goto_3a

    :cond_30
    :goto_30
    invoke-virtual {p0, v4}, Lz6/b;->g1(Lz6/b$c;)Z

    :cond_33
    add-int/lit8 v3, v3, 0x1

    goto :goto_1a

    :cond_36
    iput-boolean v1, p0, Lz6/b;->G:Z
    :try_end_38
    .catchall {:try_start_1 .. :try_end_38} :catchall_2e

    monitor-exit p0

    return-void

    :goto_3a
    :try_start_3a
    monitor-exit p0
    :try_end_3b
    .catchall {:try_start_3a .. :try_end_3b} :catchall_2e

    throw p1
.end method

.method public final declared-synchronized b0(Ljava/lang/String;)Lz6/b$d;
    .registers 9

    monitor-enter p0

    :try_start_1
    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lz6/b;->B0()V

    invoke-direct {p0}, Lz6/b;->G()V

    invoke-direct {p0, p1}, Lz6/b;->j1(Ljava/lang/String;)V

    iget-object v0, p0, Lz6/b;->A:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz6/b$c;
    :try_end_17
    .catchall {:try_start_1 .. :try_end_17} :catchall_56

    const/4 v1, 0x0

    if-nez v0, :cond_1c

    monitor-exit p0

    return-object v1

    :cond_1c
    :try_start_1c
    invoke-virtual {v0}, Lz6/b$c;->r()Lz6/b$d;

    move-result-object v0
    :try_end_20
    .catchall {:try_start_1c .. :try_end_20} :catchall_56

    if-nez v0, :cond_24

    monitor-exit p0

    return-object v1

    :cond_24
    :try_start_24
    iget v1, p0, Lz6/b;->B:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lz6/b;->B:I

    iget-object v1, p0, Lz6/b;->z:Le9/f;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    sget-object v2, Lz6/b;->W:Ljava/lang/String;

    invoke-interface {v1, v2}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    move-result-object v1

    const/16 v2, 0x20

    invoke-interface {v1, v2}, Le9/f;->F(I)Le9/f;

    move-result-object v1

    invoke-interface {v1, p1}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    move-result-object p1

    const/16 v1, 0xa

    invoke-interface {p1, v1}, Le9/f;->F(I)Le9/f;

    invoke-direct {p0}, Lz6/b;->I0()Z

    move-result p1

    if-eqz p1, :cond_59

    iget-object v1, p0, Lz6/b;->J:LT8/d;

    iget-object v2, p0, Lz6/b;->K:Lz6/b$e;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v6}, LT8/d;->j(LT8/d;LT8/a;JILjava/lang/Object;)V
    :try_end_55
    .catchall {:try_start_24 .. :try_end_55} :catchall_56

    goto :goto_59

    :catchall_56
    move-exception v0

    move-object p1, v0

    goto :goto_5b

    :cond_59
    :goto_59
    monitor-exit p0

    return-object v0

    :goto_5b
    :try_start_5b
    monitor-exit p0
    :try_end_5c
    .catchall {:try_start_5b .. :try_end_5c} :catchall_56

    throw p1
.end method

.method public final declared-synchronized c1()V
    .registers 7

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lz6/b;->z:Le9/f;

    if-eqz v0, :cond_c

    invoke-interface {v0}, Le9/z;->close()V

    goto :goto_c

    :catchall_9
    move-exception v0

    goto/16 :goto_cf

    :cond_c
    :goto_c
    iget-object v0, p0, Lz6/b;->q:LY8/a;

    iget-object v1, p0, Lz6/b;->w:Ljava/io/File;

    invoke-interface {v0, v1}, LY8/a;->b(Ljava/io/File;)Le9/z;

    move-result-object v0

    invoke-static {v0}, Le9/o;->c(Le9/z;)Le9/f;

    move-result-object v0
    :try_end_18
    .catchall {:try_start_1 .. :try_end_18} :catchall_9

    :try_start_18
    sget-object v1, Lz6/b;->P:Ljava/lang/String;

    invoke-interface {v0, v1}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    move-result-object v1

    const/16 v2, 0xa

    invoke-interface {v1, v2}, Le9/f;->F(I)Le9/f;

    sget-object v1, Lz6/b;->Q:Ljava/lang/String;

    invoke-interface {v0, v1}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    move-result-object v1

    invoke-interface {v1, v2}, Le9/f;->F(I)Le9/f;

    iget v1, p0, Lz6/b;->s:I

    int-to-long v3, v1

    invoke-interface {v0, v3, v4}, Le9/f;->Z0(J)Le9/f;

    move-result-object v1

    invoke-interface {v1, v2}, Le9/f;->F(I)Le9/f;

    iget v1, p0, Lz6/b;->t:I

    int-to-long v3, v1

    invoke-interface {v0, v3, v4}, Le9/f;->Z0(J)Le9/f;

    move-result-object v1

    invoke-interface {v1, v2}, Le9/f;->F(I)Le9/f;

    invoke-interface {v0, v2}, Le9/f;->F(I)Le9/f;

    iget-object v1, p0, Lz6/b;->A:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_93

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "next(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lz6/b$c;

    invoke-virtual {v3}, Lz6/b$c;->b()Lz6/b$b;

    move-result-object v4

    const/16 v5, 0x20

    if-eqz v4, :cond_7c

    sget-object v4, Lz6/b;->U:Ljava/lang/String;

    invoke-interface {v0, v4}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    move-result-object v4

    invoke-interface {v4, v5}, Le9/f;->F(I)Le9/f;

    invoke-virtual {v3}, Lz6/b$c;->d()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    invoke-interface {v0, v2}, Le9/f;->F(I)Le9/f;

    goto :goto_4d

    :catchall_7a
    move-exception v1

    goto :goto_c9

    :cond_7c
    sget-object v4, Lz6/b;->T:Ljava/lang/String;

    invoke-interface {v0, v4}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    move-result-object v4

    invoke-interface {v4, v5}, Le9/f;->F(I)Le9/f;

    invoke-virtual {v3}, Lz6/b$c;->d()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    invoke-virtual {v3, v0}, Lz6/b$c;->s(Le9/f;)V

    invoke-interface {v0, v2}, Le9/f;->F(I)Le9/f;

    goto :goto_4d

    :cond_93
    sget-object v1, Lh8/A;->a:Lh8/A;
    :try_end_95
    .catchall {:try_start_18 .. :try_end_95} :catchall_7a

    const/4 v1, 0x0

    :try_start_96
    invoke-static {v0, v1}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lz6/b;->q:LY8/a;

    iget-object v1, p0, Lz6/b;->v:Ljava/io/File;

    invoke-interface {v0, v1}, LY8/a;->d(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_ac

    iget-object v0, p0, Lz6/b;->q:LY8/a;

    iget-object v1, p0, Lz6/b;->v:Ljava/io/File;

    iget-object v2, p0, Lz6/b;->x:Ljava/io/File;

    invoke-interface {v0, v1, v2}, LY8/a;->e(Ljava/io/File;Ljava/io/File;)V

    :cond_ac
    iget-object v0, p0, Lz6/b;->q:LY8/a;

    iget-object v1, p0, Lz6/b;->w:Ljava/io/File;

    iget-object v2, p0, Lz6/b;->v:Ljava/io/File;

    invoke-interface {v0, v1, v2}, LY8/a;->e(Ljava/io/File;Ljava/io/File;)V

    iget-object v0, p0, Lz6/b;->q:LY8/a;

    iget-object v1, p0, Lz6/b;->x:Ljava/io/File;

    invoke-interface {v0, v1}, LY8/a;->f(Ljava/io/File;)V

    invoke-direct {p0}, Lz6/b;->P0()Le9/f;

    move-result-object v0

    iput-object v0, p0, Lz6/b;->z:Le9/f;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz6/b;->C:Z

    iput-boolean v0, p0, Lz6/b;->H:Z
    :try_end_c7
    .catchall {:try_start_96 .. :try_end_c7} :catchall_9

    monitor-exit p0

    return-void

    :goto_c9
    :try_start_c9
    throw v1
    :try_end_ca
    .catchall {:try_start_c9 .. :try_end_ca} :catchall_ca

    :catchall_ca
    move-exception v2

    :try_start_cb
    invoke-static {v0, v1}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2

    :goto_cf
    monitor-exit p0
    :try_end_d0
    .catchall {:try_start_cb .. :try_end_d0} :catchall_9

    throw v0
.end method

.method public declared-synchronized close()V
    .registers 7

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, Lz6/b;->E:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_4e

    iget-boolean v0, p0, Lz6/b;->F:Z

    if-eqz v0, :cond_b

    goto :goto_4e

    :cond_b
    iget-object v0, p0, Lz6/b;->A:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v2, "<get-values>(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    new-array v3, v2, [Lz6/b$c;

    invoke-interface {v0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz6/b$c;

    array-length v3, v0

    :goto_20
    if-ge v2, v3, :cond_3c

    aget-object v4, v0, v2

    invoke-static {v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lz6/b$c;->b()Lz6/b$b;

    move-result-object v5

    if-eqz v5, :cond_39

    invoke-virtual {v4}, Lz6/b$c;->b()Lz6/b$b;

    move-result-object v4

    if-eqz v4, :cond_39

    invoke-virtual {v4}, Lz6/b$b;->d()V

    goto :goto_39

    :catchall_37
    move-exception v0

    goto :goto_52

    :cond_39
    :goto_39
    add-int/lit8 v2, v2, 0x1

    goto :goto_20

    :cond_3c
    invoke-virtual {p0}, Lz6/b;->i1()V

    iget-object v0, p0, Lz6/b;->z:Le9/f;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v0}, Le9/z;->close()V

    const/4 v0, 0x0

    iput-object v0, p0, Lz6/b;->z:Le9/f;

    iput-boolean v1, p0, Lz6/b;->F:Z
    :try_end_4c
    .catchall {:try_start_1 .. :try_end_4c} :catchall_37

    monitor-exit p0

    return-void

    :cond_4e
    :goto_4e
    :try_start_4e
    iput-boolean v1, p0, Lz6/b;->F:Z
    :try_end_50
    .catchall {:try_start_4e .. :try_end_50} :catchall_37

    monitor-exit p0

    return-void

    :goto_52
    :try_start_52
    monitor-exit p0
    :try_end_53
    .catchall {:try_start_52 .. :try_end_53} :catchall_37

    throw v0
.end method

.method public declared-synchronized flush()V
    .registers 2

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, Lz6/b;->E:Z
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_17

    if-nez v0, :cond_7

    monitor-exit p0

    return-void

    :cond_7
    :try_start_7
    invoke-direct {p0}, Lz6/b;->G()V

    invoke-virtual {p0}, Lz6/b;->i1()V

    iget-object v0, p0, Lz6/b;->z:Le9/f;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v0}, Le9/f;->flush()V
    :try_end_15
    .catchall {:try_start_7 .. :try_end_15} :catchall_17

    monitor-exit p0

    return-void

    :catchall_17
    move-exception v0

    :try_start_18
    monitor-exit p0
    :try_end_19
    .catchall {:try_start_18 .. :try_end_19} :catchall_17

    throw v0
.end method

.method public final g1(Lz6/b$c;)Z
    .registers 12

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lz6/b;->D:Z

    const/16 v1, 0xa

    const/16 v2, 0x20

    const/4 v3, 0x1

    if-nez v0, :cond_3d

    invoke-virtual {p1}, Lz6/b$c;->f()I

    move-result v0

    if-lez v0, :cond_2d

    iget-object v0, p0, Lz6/b;->z:Le9/f;

    if-eqz v0, :cond_2d

    sget-object v4, Lz6/b;->U:Ljava/lang/String;

    invoke-interface {v0, v4}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    invoke-interface {v0, v2}, Le9/f;->F(I)Le9/f;

    invoke-virtual {p1}, Lz6/b$c;->d()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    invoke-interface {v0, v1}, Le9/f;->F(I)Le9/f;

    invoke-interface {v0}, Le9/f;->flush()V

    :cond_2d
    invoke-virtual {p1}, Lz6/b$c;->f()I

    move-result v0

    if-gtz v0, :cond_39

    invoke-virtual {p1}, Lz6/b$c;->b()Lz6/b$b;

    move-result-object v0

    if-eqz v0, :cond_3d

    :cond_39
    invoke-virtual {p1, v3}, Lz6/b$c;->q(Z)V

    return v3

    :cond_3d
    invoke-virtual {p1}, Lz6/b$c;->b()Lz6/b$b;

    move-result-object v0

    if-eqz v0, :cond_46

    invoke-virtual {v0}, Lz6/b$b;->d()V

    :cond_46
    iget v0, p0, Lz6/b;->t:I

    const/4 v4, 0x0

    :goto_49
    if-ge v4, v0, :cond_70

    iget-object v5, p0, Lz6/b;->q:LY8/a;

    invoke-virtual {p1}, Lz6/b$c;->a()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/io/File;

    invoke-interface {v5, v6}, LY8/a;->f(Ljava/io/File;)V

    iget-wide v5, p0, Lz6/b;->y:J

    invoke-virtual {p1}, Lz6/b$c;->e()[J

    move-result-object v7

    aget-wide v7, v7, v4

    sub-long/2addr v5, v7

    iput-wide v5, p0, Lz6/b;->y:J

    invoke-virtual {p1}, Lz6/b$c;->e()[J

    move-result-object v5

    const-wide/16 v6, 0x0

    aput-wide v6, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_49

    :cond_70
    iget v0, p0, Lz6/b;->B:I

    add-int/2addr v0, v3

    iput v0, p0, Lz6/b;->B:I

    iget-object v0, p0, Lz6/b;->z:Le9/f;

    if-eqz v0, :cond_8b

    sget-object v4, Lz6/b;->V:Ljava/lang/String;

    invoke-interface {v0, v4}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    invoke-interface {v0, v2}, Le9/f;->F(I)Le9/f;

    invoke-virtual {p1}, Lz6/b$c;->d()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    invoke-interface {v0, v1}, Le9/f;->F(I)Le9/f;

    :cond_8b
    iget-object v0, p0, Lz6/b;->A:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Lz6/b$c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lz6/b;->I0()Z

    move-result p1

    if-eqz p1, :cond_a5

    iget-object v4, p0, Lz6/b;->J:LT8/d;

    iget-object v5, p0, Lz6/b;->K:Lz6/b$e;

    const/4 v8, 0x2

    const/4 v9, 0x0

    const-wide/16 v6, 0x0

    invoke-static/range {v4 .. v9}, LT8/d;->j(LT8/d;LT8/a;JILjava/lang/Object;)V

    :cond_a5
    return v3
.end method

.method public final i1()V
    .registers 5

    :cond_0
    iget-wide v0, p0, Lz6/b;->y:J

    iget-wide v2, p0, Lz6/b;->u:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_f

    invoke-direct {p0}, Lz6/b;->h1()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_f
    const/4 v0, 0x0

    iput-boolean v0, p0, Lz6/b;->G:Z

    return-void
.end method

.method public final declared-synchronized isClosed()Z
    .registers 2

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, Lz6/b;->F:Z
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_5

    monitor-exit p0

    return v0

    :catchall_5
    move-exception v0

    :try_start_6
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_6 .. :try_end_7} :catchall_5

    throw v0
.end method

.method public final q0()Z
    .registers 1

    iget-boolean p0, p0, Lz6/b;->F:Z

    return p0
.end method

.method public final declared-synchronized remove(Ljava/lang/String;)Z
    .registers 7

    monitor-enter p0

    :try_start_1
    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lz6/b;->B0()V

    invoke-direct {p0}, Lz6/b;->G()V

    invoke-direct {p0, p1}, Lz6/b;->j1(Ljava/lang/String;)V

    iget-object v0, p0, Lz6/b;->A:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz6/b$c;
    :try_end_17
    .catchall {:try_start_1 .. :try_end_17} :catchall_2d

    const/4 v0, 0x0

    if-nez p1, :cond_1c

    monitor-exit p0

    return v0

    :cond_1c
    :try_start_1c
    invoke-virtual {p0, p1}, Lz6/b;->g1(Lz6/b$c;)Z

    move-result p1

    if-eqz p1, :cond_2f

    iget-wide v1, p0, Lz6/b;->y:J

    iget-wide v3, p0, Lz6/b;->u:J

    cmp-long v1, v1, v3

    if-gtz v1, :cond_2f

    iput-boolean v0, p0, Lz6/b;->G:Z
    :try_end_2c
    .catchall {:try_start_1c .. :try_end_2c} :catchall_2d

    goto :goto_2f

    :catchall_2d
    move-exception p1

    goto :goto_31

    :cond_2f
    :goto_2f
    monitor-exit p0

    return p1

    :goto_31
    :try_start_31
    monitor-exit p0
    :try_end_32
    .catchall {:try_start_31 .. :try_end_32} :catchall_2d

    throw p1
.end method

.method public final t0()Ljava/io/File;
    .registers 1

    iget-object p0, p0, Lz6/b;->r:Ljava/io/File;

    return-object p0
.end method

.method public final w0()LY8/a;
    .registers 1

    iget-object p0, p0, Lz6/b;->q:LY8/a;

    return-object p0
.end method
