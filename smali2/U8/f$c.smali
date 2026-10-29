.class final LU8/f$c;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU8/f;->j(LU8/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic r:LP8/g;

.field final synthetic s:LP8/t;

.field final synthetic t:LP8/a;


# direct methods
.method constructor <init>(LP8/g;LP8/t;LP8/a;)V
    .registers 4

    iput-object p1, p0, LU8/f$c;->r:LP8/g;

    iput-object p2, p0, LU8/f$c;->s:LP8/t;

    iput-object p3, p0, LU8/f$c;->t:LP8/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .registers 3

    iget-object v0, p0, LU8/f$c;->r:LP8/g;

    invoke-virtual {v0}, LP8/g;->d()Lc9/c;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v1, p0, LU8/f$c;->s:LP8/t;

    invoke-virtual {v1}, LP8/t;->d()Ljava/util/List;

    move-result-object v1

    iget-object p0, p0, LU8/f$c;->t:LP8/a;

    invoke-virtual {p0}, LP8/a;->l()LP8/v;

    move-result-object p0

    invoke-virtual {p0}, LP8/v;->i()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lc9/c;->a(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 1

    invoke-virtual {p0}, LU8/f$c;->a()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
