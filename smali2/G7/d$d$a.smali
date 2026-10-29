.class final LG7/d$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/d$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

.field final synthetic r:LJ7/i;

.field final synthetic s:LS1/a;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LJ7/i;LS1/a;)V
    .registers 4

    iput-object p1, p0, LG7/d$d$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    iput-object p2, p0, LG7/d$d$a;->r:LJ7/i;

    iput-object p3, p0, LG7/d$d$a;->s:LS1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lh8/o;Lm8/e;)Ljava/lang/Object;
    .registers 19

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, LN1/a;

    invoke-virtual/range {p1 .. p1}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, LA7/a;

    sget-object v1, LG7/d;->a:LG7/d;

    iget-object v13, v0, LG7/d$d$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    iget-object v14, v0, LG7/d$d$a;->r:LJ7/i;

    iget-object v0, v0, LG7/d$d$a;->s:LS1/a;

    new-instance v15, LO1/b;

    invoke-virtual {v14}, LJ7/i;->c0()LI8/O;

    move-result-object v2

    invoke-interface {v2}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    const/16 v11, 0xbc

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v2, v15

    invoke-direct/range {v2 .. v12}, LO1/b;-><init>(Ljava/lang/String;LN1/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;LO2/f;LA7/a;LA7/g;ILkotlin/jvm/internal/h;)V

    move-object v12, v14

    const/4 v14, 0x0

    move-object v10, v1

    move-object v11, v13

    move-object v13, v0

    invoke-static/range {v10 .. v15}, LG7/d;->d(LG7/d;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LJ7/i;LS1/a;ZLO1/b;)V

    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lh8/o;

    invoke-virtual {p0, p1, p2}, LG7/d$d$a;->a(Lh8/o;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
