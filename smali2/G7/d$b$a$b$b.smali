.class final LG7/d$b$a$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/d$b$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

.field final synthetic r:LS1/a;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LS1/a;)V
    .registers 3

    iput-object p1, p0, LG7/d$b$a$b$b;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    iput-object p2, p0, LG7/d$b$a$b$b;->r:LS1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lh8/o;Lm8/e;)Ljava/lang/Object;
    .registers 4

    invoke-virtual {p1}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {p1}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, p0, LG7/d$b$a$b$b;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    iget-object p0, p0, LG7/d$b$a$b$b;->r:LS1/a;

    invoke-interface {v0, p2, p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->g(Ljava/util/List;ILS1/a;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lh8/o;

    invoke-virtual {p0, p1, p2}, LG7/d$b$a$b$b;->a(Lh8/o;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
