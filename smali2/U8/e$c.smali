.class public final LU8/e$c;
.super Le9/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU8/e;-><init>(LP8/z;LP8/B;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic o:LU8/e;


# direct methods
.method constructor <init>(LU8/e;)V
    .registers 2

    iput-object p1, p0, LU8/e$c;->o:LU8/e;

    invoke-direct {p0}, Le9/c;-><init>()V

    return-void
.end method


# virtual methods
.method protected B()V
    .registers 1

    iget-object p0, p0, LU8/e$c;->o:LU8/e;

    invoke-virtual {p0}, LU8/e;->cancel()V

    return-void
.end method
