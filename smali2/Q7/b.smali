.class public final synthetic LQ7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv4/g;


# instance fields
.field public final synthetic a:LQ7/f;

.field public final synthetic b:LQ7/f$a;


# direct methods
.method public synthetic constructor <init>(LQ7/f;LQ7/f$a;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ7/b;->a:LQ7/f;

    iput-object p2, p0, LQ7/b;->b:LQ7/f$a;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .registers 3

    iget-object v0, p0, LQ7/b;->a:LQ7/f;

    iget-object p0, p0, LQ7/b;->b:LQ7/f$a;

    check-cast p1, Lh5/c;

    invoke-static {v0, p0, p1}, LQ7/f;->c(LQ7/f;LQ7/f$a;Lh5/c;)V

    return-void
.end method
