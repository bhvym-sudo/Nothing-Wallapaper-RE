.class public final synthetic LQ7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv4/f;


# instance fields
.field public final synthetic a:LQ7/f;

.field public final synthetic b:LQ7/f$a;


# direct methods
.method public synthetic constructor <init>(LQ7/f;LQ7/f$a;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ7/c;->a:LQ7/f;

    iput-object p2, p0, LQ7/c;->b:LQ7/f$a;

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Exception;)V
    .registers 3

    iget-object v0, p0, LQ7/c;->a:LQ7/f;

    iget-object p0, p0, LQ7/c;->b:LQ7/f$a;

    invoke-static {v0, p0, p1}, LQ7/f;->a(LQ7/f;LQ7/f$a;Ljava/lang/Exception;)V

    return-void
.end method
