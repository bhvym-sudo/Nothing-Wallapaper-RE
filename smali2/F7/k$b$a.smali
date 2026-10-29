.class final LF7/k$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF7/k$b;-><init>(Le3/z0;Lcom/android/launcher3/f;LE7/S;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:Le3/z0;

.field final synthetic r:LF7/k$b;


# direct methods
.method constructor <init>(Le3/z0;LF7/k$b;)V
    .registers 3

    iput-object p1, p0, LF7/k$b$a;->q:Le3/z0;

    iput-object p2, p0, LF7/k$b$a;->r:LF7/k$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, LF7/k$b$a;->q:Le3/z0;

    iget-object p0, p0, LF7/k$b$a;->r:LF7/k$b;

    invoke-static {v0, p0}, LF7/k$b;->e(Le3/z0;LF7/k$b;)V

    return-void
.end method
