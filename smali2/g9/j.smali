.class public final synthetic Lg9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lg9/i$b$a;

.field public final synthetic r:Lg9/f;

.field public final synthetic s:Lg9/x;


# direct methods
.method public synthetic constructor <init>(Lg9/i$b$a;Lg9/f;Lg9/x;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/j;->q:Lg9/i$b$a;

    iput-object p2, p0, Lg9/j;->r:Lg9/f;

    iput-object p3, p0, Lg9/j;->s:Lg9/x;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, Lg9/j;->q:Lg9/i$b$a;

    iget-object v1, p0, Lg9/j;->r:Lg9/f;

    iget-object p0, p0, Lg9/j;->s:Lg9/x;

    invoke-static {v0, v1, p0}, Lg9/i$b$a;->d(Lg9/i$b$a;Lg9/f;Lg9/x;)V

    return-void
.end method
